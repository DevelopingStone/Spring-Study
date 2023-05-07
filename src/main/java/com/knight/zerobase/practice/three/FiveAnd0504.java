package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class FiveAnd0504 {

  public static void main(String[] args) {
    int [] num = {1,2,3,4,5,6,7,8,9};

    Solution0504 user = new Solution0504();
    System.out.println(user.solution(num,20));
  }
}

class Solution0504 {

  public int solution(int[] A, int K) {
    Arrays.sort(A);
    int count = 0;
    int sum = 0;

    for (int num : A) {
      if (sum <= K) {
        count++;
        sum += num;
      }
      if (sum > K) {
        count--;
        return count;
      }

    }

    return count;
  }
}