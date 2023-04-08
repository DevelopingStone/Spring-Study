// Practice4
// 두 문자열 비교
// 단, #은 backspace 로 바로 이전의 문자를 삭제하는 기능이라고 가정

// 입출력 예시
// 입력: s1 = "tree", s2 = "th#ree"
// 출력: true

// 입력: s1 = "ab#a", s2 = "aab#"
// 출력: true

// 입력: s1 = "wo#w", s2 = "ww#o"
// 출력: false


import java.util.Stack;

public class Practice4 {

  public static boolean stringCompare(String s1, String s2) {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    for (String i : s1.split("")) {
      if (!i.equals("#")) {
        stack1.push(i);
      } else {
        stack1.pop();

      }


    }
    for (String i : s2.split("")) {
      if (!i.equals("#")) {
        stack2.push(i);
      } else {
        stack2.pop();
      }


    }

    if (stack1.equals(stack2)) {
      return true;
    } else {

      return false;
    }
  }

  public static void main(String[] args) {
    // Test code
    String s1 = "tree";
    String s2 = "th#ree";
    System.out.println(stringCompare(s1, s2));

    s1 = "ab#a";
    s2 = "aab#";
    System.out.println(stringCompare(s1, s2));

    s1 = "wo#w";
    s2 = "ww#o";
    System.out.println(stringCompare(s1, s2));
  }
}
