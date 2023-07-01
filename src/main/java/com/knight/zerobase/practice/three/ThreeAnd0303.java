package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeAnd0303 {

  public static void main(String[] args) {

    Solution0303 user = new Solution0303();
    int[] A = {1, 2, 3, 4, 5};
    System.out.println(user.solution(A));

  }

}


class Solution0303 {

  public int solution(int[] A) {
    List<Integer> list = new ArrayList<>();
    Arrays.sort(A);
    boolean tf = true;
    int sum = 0;
    int size = (int) A.length / 2;
    for (int i = size - 1, j = size; ; i--, j++) {
      list.add(A[j]);
      if (list.size() == A.length) {
        break;
      }
      list.add(A[i]);
      if (list.size() == A.length) {
        break;
      }


    }

    for (int i = 0; i < list.size(); i++) {
      if (tf) {
        sum += list.get(i) * (i + 1);
        tf = false;
      } else {
        sum -= list.get(i) * (i + 1);
        tf = true;
      }
    }

    return sum;

  }
}