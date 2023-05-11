package com.knight.homework;


import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {2, 4, 8};

    System.out.println(user.solution(4, 14));


  }


}


class Solution {
  public int[] solution(int num, int total) {
    int[] answer = new int[num];
    int check = num*(num+1) / 2;
    int start = (total - check) / num + 1;
    for (int i = 0; i < answer.length; i++) {
      answer[i] = start + i ;
    }

    System.out.println(Arrays.toString(answer));
    return answer;
  }
}
