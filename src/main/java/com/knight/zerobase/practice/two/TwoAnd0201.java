package com.knight.zerobase.practice.two;

import java.util.Arrays;

public class TwoAnd0201 {

}

class Solution0201 {
  public int solution(int[] useageArr, int fee) {
    int answer = Arrays.stream(useageArr).sum()*fee;
//    Arrays.stream().sum() 메소드를 통해 배열안의 값들을 모두 더할수 있다. (문제난이도가..아쉽..)
    return answer;
  }
}