package com.knight.zerobase.coding2;

import java.util.Stack;

public class TwoAnd03 {

  public static void main(String[] args) {

    Solution0203 user = new Solution0203();
    System.out.println(user.solution("f2{a3{bc}}z"));

  }
}


class Solution0203 {
  public String solution(String str) {
    Stack<Integer> numStack = new Stack<>();
    Stack<StringBuilder> strStack = new Stack<>();
    StringBuilder result = new StringBuilder();
    int num = 0;

    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) {
        num = num * 10 + (c - '0');
      } else if (c == '{') {
        numStack.push(num);
        strStack.push(result);
        result = new StringBuilder();
        num = 0;
      } else if (c == '}') {
        StringBuilder temp = strStack.pop();
        int repeat = numStack.pop();
        for (int i = 0; i < repeat; i++) {
          temp.append(result);
        }
        result = temp;
      } else {
        result.append(c);
      }
    }

    return result.toString();
  }
}
