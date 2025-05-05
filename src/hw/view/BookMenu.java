package hw.view;

import hw.controller.BookManager;
import hw.model.BookDTO;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void menu() {
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색출력");
            System.out.println("4. 전체 출력");
            System.out.println("5. 끝내기");
            System.out.print("메뉴 선택 : ");

            int num = sc.nextInt();
            sc.nextLine();

            if (num == 1) {
                BookDTO book = inputBook();
                bm.addBook(book);
            } else if (num == 2) {
                System.out.println("삭제할 도서의 인덱스를 입력해 주세요.");
                int index = sc.nextInt();
                sc.nextLine();
                bm.deleteBook(index);
            } else if (num == 3) {
                System.out.println("확인할 도서명을 입력해주세요.");
                String title = inputBookTitle();
                int index = bm.searchBook(title);
                bm.printBook(index);
            } else if (num == 4) {
                bm.displayAll();
            } else if (num == 5) {
                System.out.println("정말 끝내시겠습니까?(y/n)");
                char answer = sc.nextLine().toUpperCase().charAt(0);
                if (answer == 'Y') {
                    break;
                }
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        String bNo = sc.nextLine();
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
}
