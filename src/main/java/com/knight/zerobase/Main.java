package com.knight.zerobase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int result = scan.nextInt();

    int count = 0;
    while (result > 0) {
      int num = scan.nextInt();
      list.add(num);

      result--;
    }

    int replace = scan.nextInt();

    for(Integer num : list){
      if(replace==num){
      count++;
      }
    }

    System.out.println(count);

  }


}
