package basic.java09.ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();

        msgQueue.offer(new Message("sendMail", "홍길동"));
        msgQueue.offer(new Message("sendSMS", "신용권"));
        msgQueue.offer(new Message("sendKakaotalk", "감자바"));

        while (!msgQueue.isEmpty()) {
            Message msg = msgQueue.poll();
            switch (msg.command) {
                case "sendMail" -> System.out.println(msg.to + "님에게 메일을 보냅니다.");
                case "sendSMS" -> System.out.println(msg.to + "님에게 SMS를 보냅니다.");
                case "sendKakaotalk" -> System.out.println(msg.to + "님에게 카카오톡을 보냅니다.");
            }
        }
    }
}
