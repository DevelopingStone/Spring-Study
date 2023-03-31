package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class 배열두배 {

  public static void main(String[] args) {

    main04 array = new main04();
    int[] array1 = {1, 2, 3, 4, 5};
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    array.solution(array1);

  }
}

class main04 {

  public List<Integer> solution(int[] numbers) {
    List<Integer> list = new ArrayList<>();
    for (int i : numbers) {
      list.add(i);
    }
    list.replaceAll(x -> x * 2);

    return list;
  }

}


