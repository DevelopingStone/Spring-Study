package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.List;

public class TwoAnd0204 {

  public static void main(String[] args) {
    int[] arr = {1, 2, 1};
    Solution0204 user = new Solution0204();
    user.solution(arr);
  }

}


class Solution0204 {

  public int solution(int[] arr) {
    if (arr.length % 2 == 0) {
      return 0;
    }
//    arr 값이 짝수인경우는 구술을 빼가지 않았기때문에 무조건 0을 반환

    List<Integer> list = new ArrayList<>();
//    arr배열의 값을 추적할 list 추가

    for (int i = 0; i < arr.length; i++) {
      if (!list.contains(arr[i])) {
        list.add(arr[i]);
      } else {
        list.remove(Integer.valueOf(arr[i]));
      }
    }
//    arr배열의 값중 list배열에 값이 없으면 추가
//    arr배열의 값중 list배열에 값이 있으면 삭제

    return list.get(0);
//    하나남은 값을 반환한다.


  }
}