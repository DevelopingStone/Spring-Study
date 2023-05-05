package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoAnd0205 {

}


class Solution0205 {

  public int solution(int[] arr, int n) {
    List<Integer> list = new ArrayList<>();
    for (int num : arr) {
      list.add(num);
    }
    Collections.sort(list, Collections.reverseOrder());

    int result = n;
    for (int num : list) {
      if (num <= result) {
        return num;
      }
    }
    return -1;
  }
}