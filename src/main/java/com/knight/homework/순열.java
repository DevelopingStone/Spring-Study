package com.knight.homework;

import java.util.Scanner;


public class 순열 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int line = scan.nextInt();

    Method math = new Method();

//    math.factory(num);
    math.soon(num, line);


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

  public int soon(int num, int line) {
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    for (int i = 1; i <= line; i++) {
      result /= i;
    }
    System.out.println("result = " + result);
    return result;

  }


}
