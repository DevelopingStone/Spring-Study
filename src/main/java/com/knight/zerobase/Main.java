package com.knight.zerobase;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    String[] bj = {"혁준", "하밥", "양상", "심심이", "소스왕"};
    String[] one = {"혁준", "양상"};
    String[] two = {"심심이", "소스왕"};
    System.out.println(user.solution("aacddefg"));


  }

}


class Solution {

  public String solution(String s) {
    StringBuilder sb = new StringBuilder(s);
    int i = 0;
    while (i < sb.length() - 1) {
      if (sb.charAt(i) == sb.charAt(i + 1)) {
        sb.deleteCharAt(i);
        sb.deleteCharAt(i);
        i = 0;
      } else {
        i++;
      }
    }
    return sb.toString();
  }
}