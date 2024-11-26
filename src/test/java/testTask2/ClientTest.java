package testTask2;

import org.junit.jupiter.api.Test;

import ucu.edu.ua.task2.Client;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void testClientBuilder() {
        // Arrange & Act
        Client client = Client.builder()
                .name("Jane Doe")
                .age(25)
                .sex("Female")
                .email("jane.doe@example.com")
                .build();

        // Assert
        assertEquals("Jane Doe", client.getName());
        assertEquals(25, client.getAge());
        assertEquals("Female", client.getSex());
        assertEquals("jane.doe@example.com", client.getEmail());
        assertTrue(client.getId() > 0);
    }
}