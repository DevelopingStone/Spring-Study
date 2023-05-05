package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoAnd0202 {

  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6,7,8};
    int[] arr2 = {5,6,7,8,9,10,11,12,13};
    Solution0202 user = new Solution0202();
    System.out.println(user.solution(arr1, arr2));


  }

}

class Solution0202 {

  public List<Integer> solution(int[] arr1, int[] arr2) {
    List<Integer> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    for (int num : arr1) {
      list.add(num);
    }
    for (int num : arr2) {
      if (list.contains(num)) {
        result.add(num);
      }
    }
    Collections.sort(result);
    return result;
  }
}