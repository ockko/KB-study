package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("입력 문자열:");
            String x = sc.nextLine();
            if (x.equals("q")) {
                System.out.println("종료");
                break;
            }
            System.out.println("출력 문자열:" + x);
            System.out.println();
        }
    }
}
