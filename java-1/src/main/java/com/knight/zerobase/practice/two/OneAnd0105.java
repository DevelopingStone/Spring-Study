package com.knight.zerobase.practice.two;

import java.util.HashSet;
import java.util.Set;

public class OneAnd0105 {

  public static void main(String[] args) {
    Solution0105 user = new Solution0105();
    int[] arr1 = {1, 7, 8, 4};
    int[] arr2 = {2, 4, 6, 8};
    System.out.println(user.solution(arr1, arr2));
  }


}

class Solution0105 {

  public Set<Integer> solution(int[] arr1, int[] arr2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
//    중복된값을 확인하기 위한 Set1
//    확인하고 최종값을 넣어주기위한 Set2

    for (int i : arr1) {
      set1.add(i);
    }
// arr1배열값을 set1에 넣어줍니다.

    for (int i : arr2) {
      if (set1.contains(i)) {
        set2.add(i);
      }
    }
//  arr1배열값을 넣어준 set1과 arr2를 비교한뒤
//  중복되는값은 set2에 넣어줍니다.


    return set2;
  }
}