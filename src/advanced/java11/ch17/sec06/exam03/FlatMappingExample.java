package advanced.java11.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        //문장 스트림을 단어 스트림으로 변환 후 출력
        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);
        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        //문자열 숫자 목록 스트림을 숫자 스트림으로 변환 후 출력
        list2.stream()
                .flatMapToInt(data -> Arrays.stream(data.split(", "))
                        .mapToInt(Integer::parseInt))
                .forEach(System.out::println);
    }
}
