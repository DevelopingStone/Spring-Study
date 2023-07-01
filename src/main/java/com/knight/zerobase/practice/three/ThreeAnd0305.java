package com.knight.zerobase.practice.three;

import java.util.ArrayDeque;
import java.util.Deque;

public class ThreeAnd0305 {

  public static void main(String[] args) {
    Solution0305 user = new Solution0305();
    int[] arr = {-2, -5, -3, -6, -9, -2, -5, -3, -1100, -1000, -1, -2, -3, -4, 5, - 1000};
    System.out.println(user.solution(arr));
  }

}

class Solution0305 {

  public int solution(int[] fruits) {
    Deque<Integer> deque = new ArrayDeque<>();
    int sum = 0;
    int result = 0;
    for (int num : fruits) {
      deque.add(num);
    }

    System.out.println(deque);
    for (int i = 0; i < fruits.length; i++) {
      if (deque.getFirst() < 0) {

        deque.removeFirst();
      } else {
        break;
      }

    }

    System.out.println(deque);
    for (int i = 0; i < deque.size(); i++) {
      if (deque.getLast() < 0) {
        deque.removeLast();
      } else {
        break;
      }
    }

    System.out.println(deque);

    for (int num : deque) {
      sum += num;
      if (sum > result) {
        result = sum;
        System.out.println("result = " + result);
      }

    }

    return result;
  }
}