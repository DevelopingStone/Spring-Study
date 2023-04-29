package com.knight.zerobase.practice.two;

import java.util.Stack;

public class ThreeAnd0303 {

  public static void main(String[] args) {
    String S = "2*3+5/6*3+15";
    Solution0303 user = new Solution0303();
    System.out.println(user.evaluateExpression(S));

  }

}


class Solution0303 {

  public double evaluateExpression(String expression) {
    expression = expression.replaceAll("\\s+", ""); // 공백 제거

    double currentNumber = 0;
    char currentOperator = '+';
    Stack<Double> stack = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);

      if (Character.isDigit(c)) {
        currentNumber = currentNumber * 10 + (c - '0');
      }

      if (!Character.isDigit(c) || i == expression.length() - 1) {
        if (currentOperator == '+') {
          stack.push(currentNumber);
        } else if (currentOperator == '-') {
          stack.push(-currentNumber);
        } else if (currentOperator == '*') {
          double top = stack.pop();
          stack.push(top * currentNumber);
        } else if (currentOperator == '/') {
          double top = stack.pop();
          stack.push(top / currentNumber);
        }

        currentOperator = c;
        currentNumber = 0;
      }
    }

    double result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }

    return result;
  }
}

