package com.knight.oop;

public class ExamList {
//  filed

  static String name = "홍길동";
  static int age = 34;

//  method

  public static void main(String[] args) {

    ExamList test = new Test();
    inputList();

  }

  public static final void inputList() {
    System.out.println(age);
    System.out.println(name);
  }


}

class Test extends ExamList {


  public void inputListError() {
    System.out.println("오버라이딩 불가");
  }
}

