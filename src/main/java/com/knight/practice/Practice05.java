package com.knight.practice;

public class Practice05 {

  public static void main(String[] args) {

    int[] array = {3, 1, 4, 28, 11, 3, 1, 44, 50};
    int tmp = 0;

    for (int i = 0; i < array.length; i++) {

      if (array.length / 2 > i) {
        tmp = array[array.length - i - 1];
        array[array.length - i - 1] = array[i];
        array[i] = tmp;
      } else {
        break;
      }s

    }

    for (int i : array) {
      System.out.println(i);
    }


  }
}




