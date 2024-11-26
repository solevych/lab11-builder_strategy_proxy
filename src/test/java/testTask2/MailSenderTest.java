package testTask2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ucu.edu.ua.task2.MailInfo;
import ucu.edu.ua.task2.MailSender;

import javax.mail.MessagingException;

import static org.mockito.Mockito.*;

class MailSenderTest {

    @Test
    void testSendMail() throws MessagingException {
        MailInfo mockMailInfo = Mockito.mock(MailInfo.class);
        when(mockMailInfo.generate()).thenReturn("Test email content");

        MailSender mailSender = Mockito.spy(new MailSender());

        mailSender.sendMail(mockMailInfo);

        verify(mockMailInfo, times(1)).generate();
    }
}
