package com.knight.zerobase.coding2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TwoAnd02 {

  public static void main(String[] args) {
    int[] a = {5, 2, 1, 4, 6};
    int[] b = {6, 1, 0, 4, 4};

    Solution0202 user = new Solution0202();
    System.out.println(user.solution(a, b));

  }

}


class Solution0202 {
  public Deque<Integer> solution(int[] a, int[] b) {
    Deque<Integer> list = new ArrayDeque<>();

    int lenA = a.length;
    int lenB = b.length;
    int maxLength = Math.max(lenA, lenB);
    int carry = 0;

    for (int i = 0; i < maxLength; i++) {
      int numA = (i < lenA) ? a[lenA - i - 1] : 0;
      int numB = (i < lenB) ? b[lenB - i - 1] : 0;

      int sum = numA + numB + carry;
      list.addFirst(sum % 10);
      carry = sum / 10;
    }

    if (carry > 0) {
      list.addFirst(carry);
    }

    return list;
  }
}
