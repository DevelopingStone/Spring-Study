package com.knight.oop;

public class characteristicsOfObject {
}

class Person {
    private String name;  // 상태: 이름
    private int age;       // 상태: 나이

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("안녕, 나는 " + name + "이고, " + age + "살이야.");  // 행동: 인사하기
    }

    public String getIdentity() {
        return name;  // 식별자: 이름을 식별자로 사용
    }
}

class LightBulb {
    private boolean isOn;  // 상태: 전구의 켜짐/꺼짐 상태

    public void turnOn() {
        isOn = true;  // 행동: 전구를 켜기
    }

    public void turnOff() {
        isOn = false;  // 행동: 전구를 끄기
    }

    public boolean isOn() {
        return isOn;  // 행동: 전구 상태 조회
    }
}

class Book {
    private String isbn;  // 식별자: ISBN을 사용한 책 식별

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }
}



