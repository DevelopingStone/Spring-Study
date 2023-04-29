package com.knight.homework;


public class Main {

  // 필드값, 생성자, 메소드, 메인메소드
 //  생성자를 만들떄는 기본생성자를 꼭 만들어주자
//  private

  //필드값
  private String name;
//  박강락
  private int age;
//  20

  //생성자
  Main(){

  }

  Main(String name, int age){
    this.name = name;
    this.age = age;
  }




  //메소드
  void printInfo(){
    System.out.println("name = " + this.name + ", Age : " + this.age);
  }

  public static void main(String[] args) {
    Main user = new Main("박강락",20);


    user.printInfo();


  }


}

