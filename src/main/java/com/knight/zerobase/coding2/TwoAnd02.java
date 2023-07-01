package com.knight.zerobase.coding2;

import java.util.ArrayDeque;
import java.util.Deque;

public class TwoAnd02 {

  public static void main(String[] args) {
    int[] a = {9, 9, 9, 9, 9, 9, 9};
    int[] b = {1};

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
    System.out.println("maxLength = " + maxLength);

    int carry = 0;

    for (int i = 0; i < maxLength; i++) {
      int numA = (i < lenA) ? a[lenA - i - 1] : 0;
      System.out.println(i+"numA = " + numA);
      int numB = (i < lenB) ? b[lenB - i - 1] : 0;
      System.out.println(i+"numB = " + numB);

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
