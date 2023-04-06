package com.knight.practice;

public class Practice05 {

  public static void main(String[] args) {

    int[] array = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};

    for (int i = 0; i < array.length; i++) {
      if (i == 0 && array[i] > array[i + 1]) {
        System.out.print(array[i]+",");
      }


      else if (i == array.length - 1 && array[i] > array[i - 1]) {
        System.out.print(array[i]);

      }

      else if(array[i]>array[i+1]&& array[i]>array[i-1]){
        System.out.print(array[i]+",");
      }

    }


  }
}




