package com.knight.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    int[] arr = {100, 95, 95, 95, 90, 90, 50, 40, 30, 20, 10, 15, 70, 55, 90, 80};

    System.out.println(user.solution(232443, 4));


  }


}


class Solution {
  public int solution(int num, int k) {
    System.out.println(String.valueOf(k));
    return ("-" + num).indexOf(String.valueOf(k));
  }
}
