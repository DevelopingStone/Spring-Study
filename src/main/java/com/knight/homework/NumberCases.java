package com.knight.homework;

import java.util.Scanner;

public class NumberCases {


  int count = 0;

  //  public void sumNum(int num1, int num2){
//    for(int k = 1; num1*k<=12; k++) {
//      for (int i : dice1) {
//        for (int j : dice2) {
//          if (num1*k == i + j) {
//            count++;
//          }
//        }
//      }
//    }
//    for(int k = 1; num2*k<=12; k++) {
//      for (int i : dice1) {
//        for (int j : dice2) {
//          if (num2*k == i + j) {
//            count++;
//          }
//        }
//      }
//    }
//    for(int k = 1; num1*num2*k<=12; k++) {
//      for (int i : dice1) {
//        for (int j : dice2) {
//          if (num1*num2*k == i + j) {
//            count--;
//          }
//        }
//      }
//    }
//
//  }
  public void sum(int num1, int num2) {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {

        if ((i + j) % num1 == 0 || (i + j) % num2 == 0) {
          count++;
        }


      }
    }
  }


  public void proNum(int num) {

  }

  public static void main(String[] args) {
    // 두개의 주사위를 던졌을때 3또는 4의 배수일 경우의 수

    //3   (1,2)(2,1)
    //6   (1,5)(2,4)(3,3)(4,2)(5,1)
    //9   (3,6)(4,5)(5,4)(6,3)

    //4   (1,3)(2,2)(3,1)
    //8   (2,6)(3,5)(4,4)(5,3)(6,2)
    //12  (6,6)
    Scanner scan = new Scanner(System.in);
    int sumNum1 = scan.nextInt();
    int sumNum2 = scan.nextInt();

    NumberCases user1 = new NumberCases();
    user1.sum(sumNum1, sumNum2);
    System.out.println(user1.count);

  }

}
