package com.knight.practice;

import java.util.Arrays;

public class Practice05 {

  public static void main(String[] args) {

    int[] array = {5, 3, 1, 4, 6, 1};
    int tmp = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;

        }


      }

    }

    System.out.println(Arrays.toString(array));


  }
}




