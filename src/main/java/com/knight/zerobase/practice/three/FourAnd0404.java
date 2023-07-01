package com.knight.zerobase.practice.three;

public class FourAnd0404 {

}

class Solution0404 {
  public int solution(int[] arr) {
    int count = 0;
    int sum = 0;
    for (int briSize : arr) {
      if (briSize == 1) {
        count++;
        if(count>sum){
          sum=count;
        }
      } else if (briSize == 0) {
        count = 0;
      }
    }
    return sum;
  }
}