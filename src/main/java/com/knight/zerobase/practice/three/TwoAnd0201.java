package com.knight.zerobase.practice.three;

import java.util.HashMap;
import java.util.Map;

public class TwoAnd0201 {

  public static void main(String[] args) {
    Solution0201 user = new Solution0201();
    System.out.println(user.solution("134246", 4));
  }

}

class Solution0201 {

  public int solution(String s, int n) {
    return (int) s.chars().mapToObj(Character::toString).filter(c -> c.equals(Integer.toString(n))).count();
  }

}