package basic.java11.ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; // 합계를 구하기 위한 변수

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(num -> sum += num);
        System.out.println("총합: " + sum);
    }
}
