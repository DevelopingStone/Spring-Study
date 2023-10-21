package com.knight.oop;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class StudentService {
    private final Student student;

    public StudentService() {
        this.student = new Student(); // 생성자를 통해 직접 Student 인스턴스 생성
    }

    public StudentService(Student student) {
        this.student = student;
    }

    public void getStudent() {
        student.getAge();
        student.getName();
    }
}

class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        StudentService me = new StudentService(stu);

    }
}
