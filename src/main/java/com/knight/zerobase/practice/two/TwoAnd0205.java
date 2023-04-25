package com.knight.zerobase.practice.two;

public class TwoAnd0205 {

  public static void main(String[] args) {
    Solution0205 user = new Solution0205();
    user.solution(-587);

  }

}


class Solution0205 {

  public int solution(int num) {
    StringBuilder sb = new StringBuilder(Integer.toString(num));
//    int값을 String으로 변환하기위한 StringBuilder 생성

    boolean location = true;
//    +- 부호를 구분할 boolean 생성

    int result = 0;
//    최종값을 담아줄 result 생성

    sb.reverse();
//    num값의 숫자를 뒤집어 준다

    if ("-".equals(Character.toString(sb.charAt(sb.length() - 1)))) {
      sb.deleteCharAt(sb.length() - 1);
      location = false;
    }
//    -가 있는경우 에러가 발생하기 때문에 문자열의 -부분을 제거한뒤
//    boolean을 false변경(+- 부호를 구분하기 위해)

    if (!location) {

      num = -Integer.parseInt(String.valueOf(sb));
    } else {
      num = Integer.parseInt(String.valueOf(sb));
    }
//    location이 false인경우 앞에 -를 붙여준다
//    location이 ture 인경우 앞에 +로 계산한다

    if (num >= 100000 || num <= -100000) {
      return 0;
    } else {
      return num;
    }
  }
}