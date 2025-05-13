package basic.java12.ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("c:/TEMP/Hello.java"));

        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(str);
        }

        br.close();
    }
}
