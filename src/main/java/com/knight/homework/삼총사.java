package com.knight.homework;

import java.util.*;

public class 삼총사 {

  public static void main(String[] args) {
    main05 user = new main05();
    int[] array = new int[10];
    user.solution(array);


  }


}

class main05 {

  public int solution(int[] number) {
    int count = 0;
    List<Integer> array = new ArrayList<>();

    for (int i : number) {
      array.add(i);
    }

    for (int i = 0; i < number.length; i++) {
      for (int j = i + 1; j < number.length; j++) {
        for (int z = j + 1; z < number.length; z++) {
          if (array.get(i) + array.get(j) + array.get(z) == 0) {
            count++;
          }

        }

      }
    }

    return count;


  }
}
