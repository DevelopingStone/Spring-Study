package com.knight.month;

public class Main {

  //필드값
  String name;
  int age;

  //생성자
  public Main() {
    this("이름", 34);
  }

//  this() 생성자를 호출하는방법
//  this. 필드값이랑 매개변수를 구분하기위해서 쓰는 키워드


  public Main(String name, int age) {

    this.name = name;
    this.age = age;

  }

  //메소드

  //메인메소드


  public static void main(String[] args) {
    Main user = new Main();


  }


}
