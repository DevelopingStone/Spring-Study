package com.knight.practice;

import java.util.Arrays;

public class Practice05 {

  public static void main(String[] args) {
    int[] array = {1,5,3,2,2,3,1,4,1,2,3,5};

    int[] array1 = Arrays.stream(array).distinct().toArray();

    System.out.println(Arrays.toString(array1));




  }
}




