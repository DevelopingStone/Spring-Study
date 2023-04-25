package com.knight.zerobase.practice.two;

public class OneAnd0101 {

  public static void main(String[] args) {

  }

}

class Solution0101 {

  public int solution(int[] arr) {
//    삼각형 세개의 변 사이즈를 담기위한 sum
    int sum = 0;
//    배열에서 랜덤으로 3개의 길이를 구하는 for문
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
//    가장큰 변의길이가 두개의 변의길이보다 큰경우 삼각형이 될수 없다
          if (arr[i] < arr[j] + arr[k] && arr[j] < arr[i] + arr[k] && arr[k] < arr[i] + arr[j]
              && arr[i] + arr[j] + arr[k] > sum) {
            sum = arr[i] + arr[j] + arr[k];
          }
        }
      }
    }

    return sum;
  }
}
