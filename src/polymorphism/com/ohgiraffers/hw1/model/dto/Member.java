package polymorphism.com.ohgiraffers.hw1.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount = 0;

    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
