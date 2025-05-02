package polymorphism.com.ohgiraffers.hw1.view;

import lombok.Getter;
import lombok.Setter;
import polymorphism.com.ohgiraffers.hw1.controller.LibraryManager;
import polymorphism.com.ohgiraffers.hw1.model.dto.AniBook;
import polymorphism.com.ohgiraffers.hw1.model.dto.Book;
import polymorphism.com.ohgiraffers.hw1.model.dto.CookBook;
import polymorphism.com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

@Getter
@Setter
public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별을 입력하세요.");
        char gender = sc.nextLine().charAt(0);
        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1.\t마이페이지");
            System.out.println("2.\t도서 전체 조회");
            System.out.println("3.\t도서 검색");
            System.out.println("4.\t도서 대여하기");
            System.out.println("0.\t프로그램 종료하기");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                System.out.println(lm.myInfo());
            } else if (num == 2) {
                selectAll();
            } else if (num == 3) {
                searchBook();
            } else if (num == 4) {
                rentBook();
            } else if (num == 0) {
                break;
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        for (int i = 0; i < bList.length; i++) {
            Book book = bList[i];
            if (book instanceof AniBook ani) {
                System.out.println(i + "번도서 : " + ani.getTitle() + " / " + ani.getAuthor() + " / " + ani.getPublisher() + " / " + ani.getAccessAge());
            } else if (book instanceof CookBook cook) {
                System.out.println(i + "번도서 : " + cook.getTitle() + " / " + cook.getAuthor() + " / " + cook.getPublisher() + " / " + cook.isCoupon());
            }
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);

        for (Book book : searchList) {
            try {
                if (book instanceof AniBook ani) {
                    System.out.println(ani.getTitle() + " / " + ani.getAuthor() + " / " + ani.getPublisher() + " / " + ani.getAccessAge());
                } else if (book instanceof CookBook cook) {
                    System.out.println(cook.getTitle() + " / " + cook.getAuthor() + " / " + cook.getPublisher() + " / " + cook.isCoupon());
                }
            } catch (NullPointerException e) {
                throw new NullPointerException();
            }
        }
    }

    public void rentBook() {
        selectAll();

        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        sc.nextLine();
        int result = lm.rentBook(index);
        switch (result) {
            case 0 -> System.out.println("성공적으로 대여되었습니다.");
            case 1 -> System.out.println("나이 제한으로 대여 불가능입니다.");
            case 2 -> System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }
}
