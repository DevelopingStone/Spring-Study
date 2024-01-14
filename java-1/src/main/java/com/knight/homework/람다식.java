package com.knight.homework;

interface Result {

  public abstract int plus1(int x, int y);


}

public class 람다식 {

  public static void main(String[] args) {

   Result result = (x,y) -> {
     return x>y ? x:y;
   };

    System.out.println(result.plus1(10,11));


  }


}
