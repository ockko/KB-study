package basic.java12.ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:/temp/file1.txt");

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("파일경로 : " + file.getPath());
                System.out.println("파일크기 : " + file.length());
            } else {
                System.out.println("<dir> " + file.getPath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}
