package com.knight.zerobase.practice.three;

import java.util.*;

public class ThreeAnd0301 {

}


class Solution0301 {

  public int solution(int[] arr, int n) {
    return Arrays.stream(arr).filter(i -> i >= n).min().orElse(-1);
  }
}