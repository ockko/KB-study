package basic.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값 입력: ");
        String x = sc.nextLine();

        System.out.print("y값 입력: ");
        String y = sc.nextLine();

        int sum = Integer.parseInt(x) + Integer.parseInt(y);

        System.out.println("x + y: " + sum);
    }
}
