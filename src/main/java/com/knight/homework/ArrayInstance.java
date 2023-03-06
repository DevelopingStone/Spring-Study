package com.knight.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayInstance {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    List<Integer> array = new ArrayList<>();

    for (int i = 0; i < array.size() + 1; i++) {
      Integer number = scan.nextInt();
      array.add(number);
      System.out.println("List 배열출력");
      System.out.println(array.get(i));
      
    }


  }


}




