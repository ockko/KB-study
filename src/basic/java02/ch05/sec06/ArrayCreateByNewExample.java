package basic.java02.ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d, ", i, arr1[i]);
        }
        System.out.println();

        String[] arr2 = new String[3];

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %s, ", i, arr2[i]);
        }
    }
}
