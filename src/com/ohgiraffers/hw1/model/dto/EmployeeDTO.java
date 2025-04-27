package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String information() {
        return "이름: " + getName() + ", 나이: " + getAge() + ", 신장: " + getHeight() + ", 몸무게: " + getWeight() + ", 급여: " + salary + ", 부서: " + dept;
    }
}
