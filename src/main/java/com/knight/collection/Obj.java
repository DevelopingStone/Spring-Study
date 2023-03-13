package com.knight.collection;

import com.knight.inteface.Inter;

public class Obj <T>{

/*  public static <T> void printArray(T[] arr) {
    for (T element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    printArray(intArray);

    String[] strArray = {"Hello", "World", "Java"};
    printArray(strArray);

  }*/

  public <T> void print(T[] arr){
    for(T i : arr){
      System.out.print(i);
    }

  }

  public static void main(String[] args) {
    Obj<Integer> obj1 = new Obj();
    Obj<String> obj2 = new Obj();
    Integer[] arr1 = {1,2,3,4,5};
    String[] arr2 = {"미나","사랑해","락이가"};
    obj1.print(arr1);
    obj2.print(arr2);

  }

}


