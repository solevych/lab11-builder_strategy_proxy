package ucu.edu.ua.task1;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;


@ToString
@Builder
@Getter
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;

    @Singular private List<String> courses; //можна додавати аргументи як сourse, singular можна додавати до будь якої колекції

    

    // public static class StudentBuilder {

    //     private Student student;

    //     public StudentBuilder() {
    //         this.student = new Student();
    //     }

    //     public StudentBuilder firstName(String firstName) {
    //         student.firstName = firstName;
    //         return this;
    //     }

    //     public StudentBuilder lastName(String lastName) {
    //         student.lastName = lastName;
    //         return this;
    //     }

    //     public StudentBuilder age(String age) {
    //         student.lastName = age;
    //         return this;
    //     }

    //     public Student build() {
    //         return student;

    //     }
    // }

    // public Student setFirstName(String firstName) {
    //     this.firstName = firstName;
    //     return this;
    // }

    // public Student setLasttName(String firstName) {
    //     this.firstName = lastName;
    //     return this;
    // }

}
