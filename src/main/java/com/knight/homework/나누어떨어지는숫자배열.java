package com.knight.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {

  public static void main(String[] args) {

    int[] arr = {5, 9, 7, 10};
    main12 user = new main12();
    System.out.println(user.solution(arr, 4));


  }

}


class main12 {

  public List<Integer> solution(int[] arr, int divisor) {
    List<Integer> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    for (int i : arr) {
      list.add(i);
    }
    for (int i : list) {
      if (i % divisor == 0) {
        result.add(i);
      }
    }
    Collections.sort(result);
    if (result.size() == 0) {
      result.add(-1);
    }

    return result;
  }

}
