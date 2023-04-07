// Practice2
// 괄호 짝 검사

// 입출력 예시)
// 입력: "("
// 출력: Fail

// 입력: ")"
// 출력: Fail

// 입력: "()"
// 출력: Pass

import java.util.Stack;

public class Practice2 {

  public static void checkParenthesis(String str) {

    int count = 0;
    for (String i : str.split("")) {
      if (i.equals("(")) {
        count++;
      } else {
        count--;
      }


    }
    if(count==0){
      System.out.println("PASS");
    }
    else{
      System.out.println("FAIL");
    }

  }

  public static void main(String[] args) {
    // Test code
    checkParenthesis("(");          // FAIL!
    checkParenthesis(")");          // FAIL!
    checkParenthesis("()");         // PASS!
    checkParenthesis("()()()");     // PASS!
    checkParenthesis("(())()");     // PASS!
    checkParenthesis("(((()))");    // FAIL!


  }
}
