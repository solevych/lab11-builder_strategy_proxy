package testTask2;

import org.junit.jupiter.api.Test;

import ucu.edu.ua.task2.Client;
import ucu.edu.ua.task2.MailCode;
import ucu.edu.ua.task2.BirthdayMailCode;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayMailCodeTest {

    @Test
    void testGenerate() {
        // Arrange
        Client client = Client.builder()
                .name("John Doe")
                .age(30)
                .sex("Male")
                .email("john.doe@example.com")
                .build();
        MailCode birthdayMailCode = new BirthdayMailCode();

        String result = birthdayMailCode.generate(client);

        assertEquals("Dear John Doe! Happy 30! birthday", result);
    }
}