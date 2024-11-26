package testTask1;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.task1.Gender;
import ucu.edu.ua.task1.Student;
import ucu.edu.ua.task1.User;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;


public class TestUserStudent {

    @Test
    public void testStudentBuilder() {
        // Create a Student using the builder
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .gender("Male")
                .email("john.doe@example.com")
                .age(20)
                .course("Mathematics") // Add single course
                .course("Physics")     // Add another course
                .build();

        // Assertions
        assertNotNull(student);
        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
        assertEquals("Male", student.getGender());
        assertEquals("john.doe@example.com", student.getEmail());
        assertEquals(20, student.getAge());
        assertEquals(Arrays.asList("Mathematics", "Physics"), student.getCourses());

        // Print student details
        System.out.println(student);
    }

    @Test
    public void testUserBuilder() {
        // Create a User using the builder
        User user = User.builder()
                .name("Alice")
                .age(25)
                .gender(Gender.FEMALE)
                .weight(55.5)
                .height(165.0)
                .build();

        // Assertions
        assertNotNull(user);
        assertEquals("Alice", user.getName());
        assertEquals(25, user.getAge());
        assertEquals(Gender.FEMALE, user.getGender());
        assertEquals(55.5, user.getWeight());
        assertEquals(165.0, user.getHeight());

        // Print user details
        System.out.println(user);
    }

    @Test
    public void testGenderEnum() {
        // Test Gender enum values
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;

        // Assertions
        assertEquals("MALE", male.name());
        assertEquals("FEMALE", female.name());

        // Print gender values
        System.out.println("Gender values: " + male + ", " + female);
    }
}
