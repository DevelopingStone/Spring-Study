package com.knight.zerobase;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    String[] bj = {"혁준", "하밥", "양상", "심심이", "소스왕"};
    String[] one = {"혁준", "양상"};
    String[] two = {"심심이", "소스왕"};

    String[] arr = {"10110", "1010", "11110"};
    System.out.println(user.solution(bj));


  }

}


class Solution {

  public String solution(String[] arr) {
    String str = "";
    for (String result : arr) {
      str += result;
      str += ",";
    }
    return str = str.substring(0, str.length() - 1);
  }
}