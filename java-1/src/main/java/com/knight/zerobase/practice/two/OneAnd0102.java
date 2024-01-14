package com.knight.zerobase.practice.two;

import java.util.Arrays;

public class OneAnd0102 {

  public static void main(String[] args) {

  }


}

class Solution0102 {

  public int solution(int[] arr) {
    int sum = 0;
//    전체소득을 구하기위한 sum 변수값
    Arrays.sort(arr);
//    오름차순으로 변경후
    arr[0] = 0;
    arr[arr.length - 1] = 0;
//    가장작은값과 가장큰값을 0으로 변경
    for(int i : arr){
      sum+=i;
    }
    sum = sum/(arr.length - 2);
//    나머지 평균을 구하기


    return sum;
  }
}