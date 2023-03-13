package com.knight.excep;

public class WhatExcep {

  public static void main(String[] args) throws Exception_Plus, Exception_Subtract {

    Calculator cal = new Calculator();

    try {
      System.out.println(cal.plus(100, 101));
      System.out.println(cal.subtract(100, 101));
    } catch (Exception e) {
      System.out.println("모든값에 대한 예외처리를 여기서 담당");
    }

    finally{
      System.out.println("무조건 실행되는 곳입니다.");
      System.out.println("동일한 문구가 발생할경우 finally적어두면 좋습니다.");
      System.out.println("코드를 집중화 할수 있습니다.");
    }


  }


}
