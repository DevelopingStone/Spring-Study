package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class OneAnd0102 {
  public static void main(String[] args) {
    int [] arr = {100,95,95,95,90,85,90,10,5,0,0,5,10,15};
    Solution0102 user = new Solution0102();
    System.out.println(user.solution(arr));
  }

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