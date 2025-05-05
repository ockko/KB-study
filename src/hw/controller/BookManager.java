package hw.controller;

import hw.model.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        if (index >=0 && index < bookList.size()) {
            bookList.remove(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int searchBook(String title) {
        int index = -1;

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void printBook(int index) {
        if (index == -1) {
            System.out.println("조회한 도서가 존재하지 않음.");
        } else if (index >=0 && index < bookList.size()) {
            System.out.println(bookList.get(index));
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }
}
