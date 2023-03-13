package com.knight.oop;

public class Refer {


  public void test0() {
    System.out.println("부모클래스 test 출력 / 부모클래스만 구현");
    test1();
  }

  public void test1() {
    System.out.println("부모클래스 test1 출력 / 자식클래스도 구현");
  }


}

class NewRefer extends Refer {


  public static void main(String[] args) {
    Refer refer = new NewRefer();
    System.out.println(System.identityHashCode(refer));

//    refer.test0();
//    refer.test1();
//    NewRefer referExam = (NewRefer) refer;
//    referExam.test2();
//    ((NewRefer)refer).test2();



  }


  public void test1() {
    System.out.println("자식클래스 test1 출력 / 부모클래스도 구현");
    this.test0();
  }

  public void test2() {
    System.out.println("자식클래스 test2 출력 / 자식클래스만 구현");
  }


}
