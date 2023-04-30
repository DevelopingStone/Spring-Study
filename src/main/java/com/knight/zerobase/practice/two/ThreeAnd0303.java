package com.knight.zerobase.practice.two;

import java.util.Stack;

public class ThreeAnd0303 {

  public static void main(String[] args) {
    String S = "2*3+5/6*3+15";
    Solution0303 user = new Solution0303();
    double result = user.evaluateExpression(S);
    System.out.printf("%.2f",result);

  }

}


class Solution0303 {

  public double evaluateExpression(String expression) {
    expression = expression.replaceAll("\\s+", ""); // 공백 제거

    double currentNumber = 0; // 현재 처리 중인 숫자
    char currentOperator = '+'; // 현재 처리 중인 연산자, 초기값은 덧셈
    Stack<Double> stack = new Stack<>(); // 스택 생성

    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i); // 문자열에서 i번째 문자 추출

      if (Character.isDigit(c)) { // 숫자인 경우
        currentNumber = currentNumber * 10 + (c - '0'); // 숫자 계산
      }

      // 연산자인 경우 또는 문자열의 마지막 문자인 경우
      if (!Character.isDigit(c) || i == expression.length() - 1) {
        if (currentOperator == '+') { // 덧셈인 경우
          stack.push(currentNumber); // 스택에 현재 숫자 추가
        } else if (currentOperator == '-') { // 뺄셈인 경우
          stack.push(-currentNumber); // 스택에 음수 형태로 현재 숫자 추가
        } else if (currentOperator == '*') { // 곱셈인 경우
          double top = stack.pop(); // 스택에서 최상위 값 제거
          stack.push(top * currentNumber); // 제거한 값과 현재 숫자를 곱한 결과를 스택에 추가
        } else if (currentOperator == '/') { // 나눗셈인 경우
          double top = stack.pop(); // 스택에서 최상위 값 제거
          stack.push(top / currentNumber); // 제거한 값과 현재 숫자를 나눈 결과를 스택에 추가
        }

        currentOperator = c; // 현재 처리 중인 연산자를 갱신
        currentNumber = 0; // 현재 처리 중인 숫자를 초기화
      }
    }

    double result = 0; // 최종 계산 결과
    while (!stack.isEmpty()) { // 스택이 비어있지 않을 때까지 반복
      result += stack.pop(); // 스택에서 값을 꺼내서 최종 결과에 더함
    }

    return result; // 최종 결과 반환
  }
}
