package basic.ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자 선언
    public Car(String model) {
        this.model = model;
    }

    // 메소드 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.printf("%s가 달립니다.(시속: %dkm/h)", model, speed);
    }
}
