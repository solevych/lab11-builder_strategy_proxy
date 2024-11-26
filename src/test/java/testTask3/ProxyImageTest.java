package testTask3;

import org.junit.jupiter.api.Test;

import ucu.edu.ua.task3.ProxyImage;
import ucu.edu.ua.task3.RealImage;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {

    @Test
    void testLazyLoading() {
        // Arrange
        ProxyImage proxyImage = new ProxyImage("test_image.jpg");

        // Act
        assertNull(getRealImage(proxyImage)); // Ensure realImage is null initially

        // Trigger lazy initialization
        proxyImage.display();

        // Assert
        assertNotNull(getRealImage(proxyImage)); // realImage should now be initialized
    }

    @Test
    void testDelegationToRealImage() {
        // Arrange
        RealImage mockRealImage = mock(RealImage.class);
        ProxyImage proxyImage = new ProxyImage("test_image.jpg");

        // Use reflection to inject the mock into ProxyImage
        injectRealImage(proxyImage, mockRealImage);

        // Act
        proxyImage.display();

        // Assert
        verify(mockRealImage, times(1)).display(); // Verify display is delegated
    }

    @Test
    void testInitializationOnlyOnce() {
        // Arrange
        ProxyImage proxyImage = new ProxyImage("test_image.jpg");

        // Act
        proxyImage.display(); // First call
        RealImage firstInitialization = getRealImage(proxyImage);

        proxyImage.display(); // Second call
        RealImage secondInitialization = getRealImage(proxyImage);

        // Assert
        assertSame(firstInitialization, secondInitialization); // Ensure only one initialization
    }

    // Utility method: Use reflection to access private `realImage`
    private RealImage getRealImage(ProxyImage proxyImage) {
        try {
            var field = ProxyImage.class.getDeclaredField("realImage");
            field.setAccessible(true);
            return (RealImage) field.get(proxyImage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Utility method: Use reflection to inject a mock `RealImage`
    private void injectRealImage(ProxyImage proxyImage, RealImage mockRealImage) {
        try {
            var field = ProxyImage.class.getDeclaredField("realImage");
            field.setAccessible(true);
            field.set(proxyImage, mockRealImage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

