package com.knight.zerobase.practice.three;

import java.util.HashMap;
import java.util.Map;

public class TwoAnd0201 {

  public static void main(String[] args) {
    Solution0201 user = new Solution0201();
    System.out.println(user.solution("134246", 0));
  }

}

class Solution0201 {

  public int solution(String s, int n) {
    Map<String, Integer> map = new HashMap<>();
    int value = 0;
    for (String num : s.split("")) {
      value = map.getOrDefault(num, 0);
      map.put(num, value + 1);
    }

    if (map.get(Integer.toString(n)) == null) {
      return 0;
    }
    return map.get(Integer.toString(n));
  }
}