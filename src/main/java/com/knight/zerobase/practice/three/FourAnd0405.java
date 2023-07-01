package com.knight.zerobase.practice.three;

public class FourAnd0405 {

}


class Solution0405 {

  public boolean solution(int[] bridge, int jumpSize) {
    int jump = jumpSize;
    for (int briSize : bridge) {
      if (briSize == 0) {
        jump--;
        if (jump < 0) {
          return false;
        }
      } else if (briSize == 1) {
        jump = jumpSize;
      }
    }
    return true;
  }
}