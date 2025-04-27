package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        setName(name);
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String information() {
        return "이름: " + getName() + ", 나이: " + getAge() + ", 신장: " + getHeight() + ", 몸무게: " + getWeight() + ", 학년: " + grade + ", 전공: " + major;
    }
}
