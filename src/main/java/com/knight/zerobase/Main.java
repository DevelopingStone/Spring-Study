package com.knight.zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    String[] arr = {"abce", "abcd", "cdx"};
    String[] name = {"may", "kein", "kain", "radi"};
    int[] year = {5, 10, 1, 3};
    String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
        {"kon", "kain", "may", "coni"}};
    int[] num = {1, 2, 3, 4, 6, 7, 8, 0};
    System.out.println(user.solution(num));
  }

}


class Solution {

  public int solution(int[] numbers) {
    int[] count = new int[10];
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      count[numbers[i]]++;
    }

    System.out.println(Arrays.toString(count));

    for (int i = 0; i < count.length; i++) {
      if (count[i] == 0) {
        sum += i;
      }
    }

    return sum;
  }
}
