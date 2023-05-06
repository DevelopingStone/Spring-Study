package com.knight.zerobase.practice.three;

import java.util.Arrays;
import java.util.Comparator;

public class TwoAnd0205 {

}


class Solution0205 {

  public int solution(int[] arr, int n) {
    return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).filter(i -> i <= n)
        .findFirst().orElse(-1);
  }

}