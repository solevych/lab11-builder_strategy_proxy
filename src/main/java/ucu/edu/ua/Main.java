package ucu.edu.ua;

import java.util.List;

import ucu.edu.ua.task1.Student;
import ucu.edu.ua.task1.User;
import ucu.edu.ua.task2.Client;
import ucu.edu.ua.task2.MailInfo;
import ucu.edu.ua.task2.MailSender;
import ucu.edu.ua.task3.MyImage;
import ucu.edu.ua.task3.ProxyImage;
import ucu.edu.ua.task1.Gender;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = Student.builder()
                            .firstName("Sofiia")
                            .lastName("Bazylevych")
                            .age(18)
                            .gender(null)
                            .courses(List.of("New Course from List"))
                            .course("New course")
                            .build();

        System.out.println(student);

        User user = User.builder()
                .name("John")
                .age(30)
                .gender(Gender.MALE)
                .weight(75.5)
                .height(180.0)
                .build();


        System.out.println(user);



        Client client = Client.builder()
                .name("Client NAme")
                .age(13)
                .email("hfhfh@gmail.com")
                .build();



        MailInfo mailInfo = new MailInfo(client, client1 -> "It is jus random mail!");

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);


        MyImage image = new ProxyImage("example.png");

        System.out.println("Image not loaded yet.");

        image.display();
        System.out.println("Image is displayed.");

        image.display();

    }
}