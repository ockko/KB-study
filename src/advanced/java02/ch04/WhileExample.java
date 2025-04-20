package advanced.java02.ch04;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("예금액>");
                int deposit = sc.nextInt();
                balance += deposit;
            } else if (choice == 2) {
                System.out.print("출금액>");
                int withdrawal = sc.nextInt();
                balance -= withdrawal;
            } else if (choice == 3) {
                System.out.println("잔고>" + balance);
            } else if (choice == 4) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n프로그램 종료");
    }
}
