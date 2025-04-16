package basic.ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("택시");

        int speed = myCar.getSpeed();
        System.out.println(speed);

        myCar.setSpeed(100);
        myCar.run();
    }
}
