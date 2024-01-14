package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class FourAnd0403a {

  public static void main(String[] args) {
    Solution0403a user = new Solution0403a();
    int[][] array = {{1, 0, 1}, {1, 1, 0}, {1, 1, 1}};
    user.solution(array);

  }

}

class Solution0403a {

  public int[][] solution(int[][] array) {
    int x = array.length;
    int y = array[0].length;
    int[][] result = new int[x][y];
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        if (array[i][j] == 0) {
          result[i][j] = 0;
        } else {
          result[i][j] = Integer.MAX_VALUE;
        }
      }

    }

    for (int i = 0; i < result.length; i++) {
      System.out.println(Arrays.toString(result[i]));
    }

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        if (i > 0 && result[i - 1][j] != Integer.MAX_VALUE) {
          result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
        }

        if (j > 0 && result[i][j - 1] != Integer.MAX_VALUE) {
          result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
        }

      }
    }
    System.out.println();

    for (int i = 0; i < result.length; i++) {
      System.out.println(Arrays.toString(result[i]));
    }
    System.out.println();

    for (int i = x - 1; i >= 0; i--) {
      for (int j = y - 1; j >= 0; j--) {
        if (i < 2 && result[i + 1][j] != Integer.MAX_VALUE) {
          result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
        }

        if (j < 2 && result[i][j + 1] != Integer.MAX_VALUE) {
          result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
        }
      }
    }
    for (int i = 0; i < result.length; i++) {
      System.out.println(Arrays.toString(result[i]));
    }

    return null;
  }


}