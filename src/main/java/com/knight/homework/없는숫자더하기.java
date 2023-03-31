package com.knight.homework;

import java.util.*;

public class 없는숫자더하기 {

  public static void main(String[] args) {

    main7 user = new main7();
    List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));


  }

}

class main7 {

  int sum = 0;

  public int solution(int[] numbers) {

    for (int i : numbers) {
      sum += i;
    }

    return 45 - sum;


  }

}
