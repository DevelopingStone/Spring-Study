package com.knight.homework;

import java.util.Scanner;



public class 순열 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    Method math = new Method();
//    팩토리얼 구현
    math.factory(num);


  }

}

class Method {

  int result = 1;

  public int factory(int num) {

    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    System.out.println("result = " + result);
    return result;


  }


}
