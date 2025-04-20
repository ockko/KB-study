package basic.java02.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] arr = {84, 90, 96};

        int sum = 0;
        for (int e : arr) {
            sum += e;
        }

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (double) sum / arr.length);
    }
}
