package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class 배열두배 {

  public static void main(String[] args) {

    배열두배 array = new 배열두배();
    int[] array1 = {1,2,3,4,5};
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    array.solution(array1);

  }

  public List<Integer> solution(int[] numbers) {
    List<Integer> list = new ArrayList<>();
    for (int num : numbers) {
      list.add(num);
    }
    list.replaceAll(x -> 2 * x);
    return list;
  }

}
