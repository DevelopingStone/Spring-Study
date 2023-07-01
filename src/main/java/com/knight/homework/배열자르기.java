package com.knight.homework;

public class 배열자르기 {

  public static void main(String[] args) {

    Solution01 user01 = new Solution01();
    System.out.println(user01.solution(999));


  }

}

class Solution01 {

  public int solution(int n) {

    int result = 0;

//    if (n != 0) {
      result += n / 5;
      n = n % 5;
//    }

//    if (n != 0) {
      result += n / 3;
      n = n % 3;
//    }

//    if (n != 0) {
      result += n / 1;
//    }

    return result;

  }
}