package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveAnd0505 {

  public static void main(String[] args) {
    int[] arr = {1000, 1000, 100};
    Solution0505 user = new Solution0505();
    System.out.println(user.solution(arr));
  }

}

class Solution0505 {

  List<Integer> list = new ArrayList<>();
  List<Integer> result = new ArrayList<>();
  int[] m = {500, 100, 50, 10};
  int sum = 0;

  public List<Integer> solution(int[] arr) {

    for (int money : arr) {
      list.add(money);
      sum += money;
    }
    Collections.sort(list, Collections.reverseOrder());

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] >= 1000) {
        result.add(arr[i]);
        sum -= arr[i];
        break;
      }
    }

    for (int money : m) {
      int a = sum / money;
      sum -= (money * a);

      while (a > 0) {
        result.add(money);
        a--;
      }
      if (sum == 0) {
        return result;
      }
    }

    return result;
  }
}