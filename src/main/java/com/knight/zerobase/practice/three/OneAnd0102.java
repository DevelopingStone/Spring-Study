package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class OneAnd0102 {

}


class Solution0102 {

  public int solution(int[] arr) {
    int count = 0;
    Arrays.sort(arr);
    int median = arr[arr.length / 2];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= median) {
        count++;
      }
    }

    return count;
  }
}