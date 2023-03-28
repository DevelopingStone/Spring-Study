package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class Array {

  public static void main(String[] args) {

    Solution user01 = new Solution();

    int[] array = {1, 2, 3, 4, 5};

    user01.solution(array);


  }
}

class Solution {

  public List<Integer> solution(int[] numbers) {

    List<Integer> list = new ArrayList<Integer>();

    for (int i : numbers) {
      list.add(i);

    }

    for (int i = 0; i < numbers.length; i++) {
      list.set(i, list.get(i) * 2);
    }

    System.out.println(list);

    return list;

  }
}


