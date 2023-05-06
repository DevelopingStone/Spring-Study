package com.knight.zerobase.practice.three;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class FourAnd0402 {

  public static void main(String[] args) {
    int[] A = {2, -8, 3, -2, 4, -10};
    Solution0402 user = new Solution0402();
    System.out.println(user.solution(A));
  }

}

class Solution0402 {

  public int solution(int[] fruits) {
    Deque<Integer> deque = new ArrayDeque<>();
    for (int num : fruits) {
      deque.add(num);
    }

    // 음수를 제거
    while (!deque.isEmpty() && deque.getFirst() < 0) {
      deque.removeFirst();
    }
    while (!deque.isEmpty() && deque.getLast() < 0) {
      deque.removeLast();
    }

    // 양수의 연속된 합을 구함
    int maxSum = 0;
    int currentSum = 0;
    for (int num : deque) {
      currentSum += num;
      if (currentSum > maxSum) {
        maxSum = currentSum;
      }
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    // Deque를 역순으로 순회하며 양수의 연속된 합을 구함
    int reverseMaxSum = 0;
    currentSum = 0;
    for (Iterator<Integer> iterator = deque.descendingIterator(); iterator.hasNext(); ) {
      Integer num = iterator.next();
      currentSum += num;
      if (currentSum > reverseMaxSum) {
        reverseMaxSum = currentSum;
      }
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    // 두 양수 연속합 중 더 큰 값을 반환
    return Math.max(maxSum, reverseMaxSum);
  }

}