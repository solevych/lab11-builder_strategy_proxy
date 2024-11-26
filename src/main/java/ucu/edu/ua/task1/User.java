package ucu.edu.ua.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}
