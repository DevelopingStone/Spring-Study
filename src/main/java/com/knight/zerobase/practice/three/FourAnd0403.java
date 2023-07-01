package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class FourAnd0403 {

  public static void main(String[] args) {
    Solution0403 user = new Solution0403();
    int[][] array =  {{1, 0, 1},
                      {1, 1, 0},
                      {1, 1, 1}};
    user.solution(array);

  }

}


class Solution0403 {

  public int[][] solution(int[][] array) {
    int m = array.length;
    int n = array[0].length;
    int[][] result = new int[m][n];



    // 초기화
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i][j] == 0) {
          // 0인 경우 거리는 0
          result[i][j] = 0;
        } else {
          // 1인 경우 거리는 최대값으로 초기화
          result[i][j] = Integer.MAX_VALUE;
        }
      }
    }

    System.out.println("배열에 초기화적용된 값 : ");
    for (int i = 0; i < result.length; i++) {
      System.out.println(Arrays.toString(result[i]));
    }
    System.out.println();

    // 상하좌우 이전 위치들과 거리 계산
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {

        if (i > 0 && result[i - 1][j] != Integer.MAX_VALUE) {
          // 이전 위치에서 현재 위치까지의 거리에 1을 더한 값과 비교
          result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
        }
        if (j > 0 && result[i][j - 1] != Integer.MAX_VALUE) {
          result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
        }
      }
    }
    System.out.println("배열 상하좌우 이전 위치계산 : ");
    for (int i = 0; i < result.length; i++) {
      System.out.println(Arrays.toString(result[i]));
    }
    System.out.println();

    // 상하좌우 이후 위치들과 거리 계산
    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        if (i < m - 1 && result[i + 1][j] != Integer.MAX_VALUE) {
          // 이전 위치에서 현재 위치까지의 거리에 1을 더한 값과 비교
          result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);

        }

        if (j < n - 1 && result[i][j + 1] != Integer.MAX_VALUE) {
          result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
        }

      }
    }

    System.out.println("배열 상하좌우 이후 위치계산 : ");
    for (int z = 0; z < result.length; z++) {
      System.out.println(Arrays.toString(result[z]));
    }
    System.out.println();
    return result;
  }
}





