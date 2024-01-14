package com.knight.zerobase.practice.two;

public class TwoAnd0202 {

}

class Solution0202 {

  public int[] solution(int[] arr) {
    int[] result = new int[arr.length];
//    return 값에 넣어줄 result배열생성

    int location = 0;
//    result 배열의 위치를 추적해줄 location 변수값

    for (int i = 0; i < arr.length; i++) {
      result[location] = arr[i];
//    arr배열의 값을 result 배열에 순차적으로 넣어준다

      if (arr[i] % 2 == 1 && location < result.length - 1) {
        location++;
        result[location] = arr[i];
      }
//    단 arr배열중 홀수값은 result 배열에 한번더 넣어준다.

      if (location == result.length - 1) {
        return result;
      }
//    location 값과 배열의 값이 동일할경우 더이상 추가 불가하므로 종료한다.

      location++;
    }

    return null;
  }
}