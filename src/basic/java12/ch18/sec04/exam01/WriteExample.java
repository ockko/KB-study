package basic.java12.ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("test.txt")) {
            char a = 'A';
            char b = 'B';
            char[] arr = {'C', 'D', 'E'};
            writer.write(a);
            writer.write(b);
            writer.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
