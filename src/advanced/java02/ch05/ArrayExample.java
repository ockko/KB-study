package advanced.java02.ch05;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = 1;
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }

        System.out.println(max);
    }
}
