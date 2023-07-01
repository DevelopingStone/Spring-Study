package com.knight.zerobase.practice.two;

public class FourAnd0401 {

  public static void main(String[] args) {
    Solution0401 user = new Solution0401();
    user.solution(25, 2);

  }

}

class Solution0401 {

  public int solution(int N, int K) {

    StringBuilder sb = new StringBuilder();
    char str = Integer.toString(K).charAt(0);
    int count = 0;
//    N값을 확인하는  StringBuilder
//    K값을 확인하는 str
//    N과 K를 비교하는 값을 확인하는 count

    for (int i = 1; i <= N; i++) {
      sb.append(Integer.toString(i));
    }
//    1부터 N까지 sb에 나열한다

    for (int i = 0; i < sb.length(); i++) {
      if (str == sb.charAt(i)) {
        count++;
      }
    }
//    sb에 담은 값을 문자단위로 쪼개어 K와 비교하여 count

    return count;
  }
}