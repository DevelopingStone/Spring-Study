package com.knight.exce.Excep;

public class Main {

  public static void main(String[] args) {

    Aclass a = new Aclass();
    try {
      a.plus(10,-20);
    } catch (Number e) {
      System.out.println("두개의 합이 양수가 나와야합니다.");
    }
    finally {
      System.out.println("무조건실행");
    }

    System.out.println("출력");


  }

}
