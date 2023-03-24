package com.knight.homework;

public class 재귀함수 {

  static int result = 1;

  public static int numSquare(int num, int square) {

    if (square == 0) {
      return 1;
    }
//    } else if (square != 0) {

//      result *= num;
    return result = num * numSquare(num, square - 1);


  }


  public static void main(String[] args) {

    System.out.println(numSquare(3, 3));

  }

}
