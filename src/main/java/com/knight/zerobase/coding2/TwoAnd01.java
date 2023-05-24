package com.knight.zerobase.coding2;

import java.util.Arrays;

public class TwoAnd01 {

  public static void main(String[] args) {

    Solution0201 user = new Solution0201();
    int[] numbers = {9, 4, 2, 3, 7, 5};
    System.out.println(user.solution(numbers));

  }

}


class Solution0201 {

  public int solution(int[] numbers) {
    int[] list = new int[numbers.length];
    Arrays.sort(numbers);
    for (int i = numbers[0], j = 0; j < numbers.length; i++, j++) {
      list[j] = i;
    }

    System.out.println(Arrays.toString(list));

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] != list[i]) {
        return list[i];
      }
    }



    return 0;
  }
}