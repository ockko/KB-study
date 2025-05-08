package advanced.java09.ch15.sec05.exam03;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Person implements Comparable<Person> {
    public String name;
    public int age;

    @Override
    public int compareTo(Person o) {
        if (age < o.age) {
            return -1;
        } else if (age > o.age) {
            return 1;
        } else {
            return 0;
        }
    }
}
