package com.knight.zerobase.practice.three;

public class TwoAnd0204 {

  public static void main(String[] args) {

    boolean[][] matrix = {{true, true, true, false}, {true, true, true, false},
        {true, true, true, false}, {true, true, true, false}};

    Solution0204 user = new Solution0204();
    System.out.println(user.solution(matrix, true));
  }

}


class Solution0204 {

  public boolean solution(boolean[][] matrix, boolean b) {
    for (boolean[] tf : matrix) {
      for (boolean tfResult : tf) {
        if (tfResult != b) {
          return false;
        }
      }
    }

    return true;
  }
}