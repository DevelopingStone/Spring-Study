// Practice1
// 문자열 뒤집기

// 입출력 예시)
// 입력: "Hello"
// 출력: "OlleH"

// 입력: 1 3 5 7 9
// 출력: 9 7 5 3 1

import java.util.Stack;

public class Practice1 {

  public static String reverseString(String str) {
    Stack<String> stack = new Stack<>();
    String st = "";
    for (int i = 0; i < str.length(); i++) {
      st = str.substring(i, i + 1);
      stack.push(st);
    }

    st = "";
    while (!stack.isEmpty()) {
      st += stack.pop();
    }

    return st;

  }

  public static void main(String[] args) {
    // Test code
    Stack<String> stack = new Stack<>();

    String result = reverseString("Hello");
    System.out.println("result = " + result);

    result = reverseString("1 3 5 7 9");
    System.out.println("result = " + result);
  }
}
