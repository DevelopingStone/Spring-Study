package com.knight.zerobase.practice.two;

public class FourAnd0403 {

  public static void main(String[] args) {
    Solution0403 user = new Solution0403();
    user.solution("Hellow", "llowHe");


  }


}

class Solution0403 {

  public int solution(String S1, String S2) {
    StringBuilder sb = new StringBuilder(S1);
    String str = "";
    for (int i = 0; i < sb.length() - 1; i++) {
      str = String.valueOf(new StringBuilder(sb.substring(i + 1, sb.length())));
      for (int j = 0; j <= i; j++) {
        str += sb.charAt(j);
      }
      if (str.equals(S2)) {
        return 1;
      }
      System.out.println(str);
    }

    return 0;
  }


}

class Solution0403a {

  public int solution(String S1, String S2) {
    if (S1.length() != S2.length()) {
      // 길이가 다르면 회전 문자열이 될 수 없음
      return 0;
    }
    String S3 = S1 + S1;
    // S1을 두 번 이어붙인 문자열 생성

    if (S3.contains(S2)) {
      return 1;
    }
    // S2가 S3의 부분 문자열인지 확인
    // 큰 문자열을 기준으로 작은 문자열을 비교

    return 0;
  }
}


