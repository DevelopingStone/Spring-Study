package com.knight.practice;

public class Practice05 {

  public static void main(String[] args) {

    int[] array = {1, 1, 100, 1, 1, 1, 100,1,2,3,4,2,1,2,3,2,101,100};
    int result = 0;
    int z = 0;

    for (int i = 0; i <array.length ; i++) {

      if(array[i]>result){
        result = array[i];
        z = i;
      }
      if(array[i]==result){
        result = array[i];
        z = i;
      }


    }

    System.out.println(result);
    System.out.println(z);


  }
}




