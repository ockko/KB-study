package basic.java04.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("calculator.areaCircle = " + calculator.areaCircle(2));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("computer.areaCircle = " + computer.areaCircle(2));
    }
}
