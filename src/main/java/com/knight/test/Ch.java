package com.knight.test;

public class Ch extends Pa {

  public Ch (String name, int lv, String 종족){

  }

  public void 메소드1(){
    System.out.println("자식 클래스메소드1실행");
  }
  public void 메소드2(){
    System.out.println("메소드2실행");
    메소드1();

  }

  public static void main(String[] args) {

    Ch user = new Ch("박강락",30,"언데드");
    user.메소드2();




  }

}
