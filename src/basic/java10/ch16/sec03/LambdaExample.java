package basic.java10.ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //매개변수가 두 개일 경우
        person.action1((name, job) -> System.out.printf("%s이 %s을 합니다.\n", name, job));
        person.action1((name, job) -> System.out.printf("%s이 %s을 하지 않습니다.\n", name, job));

        //매개변수가 한 개일 경우
        person.action2(content -> System.out.printf("\"%s\"라고 말합니다.\n", content));
        person.action2(content -> System.out.printf("\"%s\"라고 외칩니다.", content));
    }
}
