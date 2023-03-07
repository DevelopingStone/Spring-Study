package com.knight.homework;

public class ArrayAmount {

  //filed
  String name ;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {

    int[] array = {1,2,3,4,5,6,7,8,9,10};

    int[] arrayAmount = new int[20];
    arrayAmount = array;
    array = new int[20];
    array = arrayAmount;



    for( int i : array){
      System.out.println(i);
    }


  }

}
