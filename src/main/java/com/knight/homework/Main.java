package com.knight.homework;


public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();

    int[] arr = {600, 400, 300, 200, 700, 800, 100, 900};
    System.out.println(user.solution("hello", "ohell"));


  }


}


class Solution{
  public int solution(String A, String B){
    int count = (A+A).indexOf(B);

    return count ;
  }

}
