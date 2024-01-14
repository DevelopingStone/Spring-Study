package com.knight.zerobase.practice.two;

public class FiveAnd0505 {

  public static void main(String[] args) {

  }

}

class Solution0505 {

  public String solution(int[] arr) {

    for (int i = 2; i < arr.length-1; i++) {
      if (i % 2 == 0) {
        if (arr[i] >= arr[i - 1]) {
          if (arr[i + 1] < arr[i - 1]) {
            return "NO";
          }
        } else {
          if (arr[i + 1] >= arr[i - 1]) {
            return "NO";
          }
        }

      } else {
        if (arr[i] >= arr[i - 2]) {
          if (arr[i - 1] < arr[i - 2]) {
            return "NO";
          }
        } else {
          if (arr[i - 1] >= arr[i - 2]) {
            return "NO";
          }
        }

      }


    }

    return "YES";
  }
}
