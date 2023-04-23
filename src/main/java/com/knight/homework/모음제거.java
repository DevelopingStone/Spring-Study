package com.knight.homework;

import java.util.HashSet;
import java.util.Set;

public class 모음제거 {

  public static void main(String[] args) {

    Solution20 user = new Solution20();
    System.out.println(user.solution(21));

  }

}


class Solution20 {

  public Set<Integer> solution(int n) {
    Set<Integer> set = new HashSet<>();

    if (n % 2 == 0) {
      set.add(2);
    }
    if (n % 3 == 0) {
      set.add(3);
    }
    if (n % 5 == 0) {
      set.add(5);
    }
    if (n % 7 == 0) {
      set.add(7);
    }
    if (set.isEmpty()) {
      set.add(n);
      return set;


    }

    return set;
  }
}


