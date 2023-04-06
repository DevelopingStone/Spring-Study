package com.knight.practice;

public class Practice05 {

  public static void main(String[] args) {

    int oddNum = 0;
    int oddNumCount = 0;
    int evenNum = 0;
    int evenNumCount = 0;
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i : array) {
      if (i % 2 == 0) {
        evenNum += i;
        evenNumCount++;

      }
      
      if (i % 2 == 1) {
        oddNum += i;
        oddNumCount++;

      }
    }

    System.out.printf("%.1f %n",(double)oddNum/oddNumCount);
    System.out.printf("%.1f %n",(double)evenNum/evenNumCount);


  }
}




