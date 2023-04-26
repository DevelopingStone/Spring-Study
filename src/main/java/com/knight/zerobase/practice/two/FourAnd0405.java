package com.knight.zerobase.practice.two;

public class FourAnd0405 {

  public static void main(String[] args) {

  }

}

class Solution {

  public int solution(String[] array, String s) {
    int count = 0;
//    조건만족하면 count 해줄 변수 생성

    for (String str : array) {
      if (s.contains(str)&&str.charAt(0)==s.charAt(0)) {
        count++;
      }
    }
//    s문자열에 str이 포함되어있으면 count 증가, s문자열 첫번째문자와 str 첫번째문자가 동일해야되는 조건추가

    return count;
  }
}
