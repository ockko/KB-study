package basic.ch06.sec08.exam02;

public class Computer {
    public int sum(int... values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}
