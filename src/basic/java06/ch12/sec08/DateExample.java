package basic.java06.ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd HH:mm:ss");
        String strNow = sdf.format(now);
        System.out.println(strNow);
    }
}
