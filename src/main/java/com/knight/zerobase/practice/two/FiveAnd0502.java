package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveAnd0502 {

  public static void main(String[] args) {

  }

}



class Solution0502 {

  public int solution(int[] nums, int n) {
    List<Integer> list = new ArrayList<>();
    for(int i : nums ){
      list.add(i);
    }
//    nums를 list에 추가

    for (int i = 0; i < list.size(); i++) {
      if (n==list.get(i)) {
        return i;
      }
    }
//    list에 들어가있는 숫자와 n값이 동일한경우 return n, 아닌경우 -1

    return -1;


  }
}