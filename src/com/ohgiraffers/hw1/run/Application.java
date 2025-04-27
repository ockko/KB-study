package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[3];
        StudentDTO student1 = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        StudentDTO student2 = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        StudentDTO student3 = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for (StudentDTO student : students) {
            System.out.println(student.information());
        }
        System.out.println();

        EmployeeDTO[] employees = new EmployeeDTO[2];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("사원의 이름을 입력하세요.");
            String name = sc.nextLine();

            System.out.println("사원의 나이를 입력하세요.");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("사원의 신장을 입력하세요.");
            double height = sc.nextDouble();
            sc.nextLine();

            System.out.println("사원의 몸무게를 입력하세요.");
            double weight = sc.nextDouble();
            sc.nextLine();

            System.out.println("사원의 급여를 입력하세요.");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.println("사원의 부서를 입력하세요.");
            String dept = sc.nextLine();

            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            if (count < employees.length) {
                System.out.println("게속 추가하시겠습니까? (y/n)");
                String continueAdding = sc.nextLine();
                if (!continueAdding.equalsIgnoreCase("y")) {
                    break;
                }
            } else {
                System.out.println("더 이상 추가할 수 없어요.");
                break;
            }
        }
        System.out.println();

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }
    }
}
