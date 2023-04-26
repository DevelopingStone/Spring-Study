package com.knight.zerobase.practice.two;

public class ThreeAnd0304 {

  public static void main(String[] args) {
    Solution0304 user = new Solution0304();
    System.out.println(user.solution(29, 15));
  }


}

class Solution0304 {

  public int solution(int A, int B) {
    String a = Integer.toBinaryString(A);
    String b = Integer.toBinaryString(B);
    int count = 0;
//    A,B 숫자를 이진수로 변경합니다.
//    두 이진수가 다를경우 count 해줄 변수를 만들어줍니다.

    while (a.length() <= 7) {
      a = "0".concat(a);

    }
    while (b.length() <= 7) {
      b = "0".concat(b);
    }
//  이진수로 변경한 a,b 길이를 맞춰주도록 합니다.
//  빈자리는 모두 0으로 채워줍니다.

    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        count++;
      }
    }
//    a,b 이진수 0,1을 비교하고 다른문자가 나올경우 1씩 count 합니다.

    return count;
  }
}