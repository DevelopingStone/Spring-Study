package com.knight.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 재귀함수 {

  static int result = 1;
  static int sum = 0;
  static int pibo = 0;

  public static int numSquare(int num, int square) {

    if (square == 0) {
      return 1;
    }

    return result = num * numSquare(num, square - 1);


  }


  public static int numSum(int num) {

    if (num == 0) {
      return 0;
    }
    return sum += num + numSum(num - 1);

  }

  public static int numPibo(int fir, int se, int num) {

    List<Integer> pibo = new ArrayList<>(Arrays.asList(fir, se));
    for (int i = 0; i < num - 2; i++) {
      int sum = 0;
      int num1 = pibo.get(i);
      int num2 = pibo.get(i + 1);
      sum = num1 + num2;
      pibo.add(sum);
    }
    
    return pibo.get(num - 1);


  }


  public static void main(String[] args) {

    System.out.println(numSquare(3, 3));
    System.out.println(numSum(5));
    System.out.println(numPibo(1, 1, 7));


  }

}
