package com.knight.zerobase.coding2;

public class TwoAnd05 {

  public static void main(String[] args) {

    int[][] image = {{99, 183, 239, 24, 109}, {113, 147, 248, 108, 168}, {224, 36, 130, 98, 82},
        {45, 227, 187, 98, 241},
        {166, 122, 206, 216, 106}};

    Solution0205 user = new Solution0205();
    System.out.println(user.solution(image, 3));

  }

}


class Solution0205 {

  public int[][] solution(int[][] image, int K) {
    int[][] answer = new int[image.length][image[0].length];
    int[] spaceX = new int[K * K];
    int[] spaceY = new int[K * K];
    int sum = 0;
    int divide = K * K;

    // spaceX, spaceY 배열 초기화
    int index = 0;
    for (int i = -K / 2; i <= K / 2; i++) {
      for (int j = -K / 2; j <= K / 2; j++) {
        spaceX[index] = i;
        spaceY[index] = j;
        index++;
      }
    }

    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image[i].length; j++) {
        for (int z = 0; z < spaceX.length; z++) {
          try {
            sum += image[i - spaceX[z]][j - spaceY[z]];
          } catch (Exception e) {
          }
        }
        answer[i][j] = sum / divide;
        sum = 0;
      }
    }

    return answer;
  }
}