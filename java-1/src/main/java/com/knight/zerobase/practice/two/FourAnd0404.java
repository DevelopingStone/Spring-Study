package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.List;

public class FourAnd0404 {

  public static void main(String[] args) {

    int[] nums = {2, 5, 6, 3, 2, 6, 6};
    Solution0404 user = new Solution0404();
    System.out.println(user.solution(nums));

  }

}


class Solution0404 {

  public int solution(int[] nums) {
    int count = 0;
//  조건에 맞을경우 count 해주는 변수생성

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (i < j && nums[i] == nums[j]) {
          count++;
//          조건에 맞는경우 count 증가

        }
      }
    }
    return count;
  }
}