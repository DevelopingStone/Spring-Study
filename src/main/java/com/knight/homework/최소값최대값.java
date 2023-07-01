package com.knight.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 최소값최대값 {

  public static void main(String[] args) {

    Main12 user = new Main12();

    System.out.println(user.solution(20, 10, 35, 30, 7));

  }

}


class Main12 {

  public List<Integer> solution(int a, int b, int c, int d, int e) {
    List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d, e));
    List<Integer> result = new ArrayList<>(Arrays.asList());
    Collections.sort(list);
    result.add(list.get(0));
    result.add(list.get(list.size() - 1));

    return result;
  }
}