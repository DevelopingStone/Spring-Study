package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    return Arrays.stream(arr1).boxed().filter(num -> Arrays.stream(arr2).anyMatch(num2 -> num2 == num)).sorted().collect(
        Collectors.toList());
  }
}