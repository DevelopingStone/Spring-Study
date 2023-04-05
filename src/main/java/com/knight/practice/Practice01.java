package com.knight.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice01 {

  public static void main(String[] args) {

    main01 user = new main01();
    System.out.println(user.solution(6));


  }

}

class main01 {

  public List<List<Integer>> solution(int a) {
    List<Integer> array1 = new ArrayList<>();
    List<List<Integer>> array2 = new ArrayList<>();

    for (int i = 1; i <= a; i++) {

      for (int j = 1; j <= i; j++) {

        if (j == 1 || j == i) {
          array1.add(1);
        } else {
          int sum = array2.get(i - 2).get(j - 2) + array2.get(i - 2).get(j - 1);
          array1.add(sum);
        }


      }
      array2.add(array1);

      array1 = new ArrayList<>();

    }

    return array2;
  }

}
