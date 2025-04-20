package basic.java02.ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = null;

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        do {
            System.out.print(">");
            message = sc.nextLine();
            System.out.println(message);
        } while (!message.equals("q"));

        System.out.println("\n프로그램 종료");
    }
}
