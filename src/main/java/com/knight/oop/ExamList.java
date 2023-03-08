package com.knight.oop;

public class ExamList {
//  filed

  String name = "홍길동";
  int age = 34;

//  method

  public void inputList() {
    System.out.println(this.age);
    System.out.println(this.name);
  }

  public static void main(String[] args) {

    ExamList list = new ExamList();

    list.inputList();

  }


}

