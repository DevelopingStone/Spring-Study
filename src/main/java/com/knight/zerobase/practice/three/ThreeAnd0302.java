package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class ThreeAnd0302 {

  public static void main(String[] args) {

    Solution0302 user = new Solution0302();
    int[] people = {30,50,60,70,80,90};
    int limit = 100;
    System.out.println(user.solution(people,limit));


  }

}


class Solution0302 {

  public int solution(int[] people, int limit) {
    Arrays.sort(people); // 물건을 무게 순으로 정렬
    int count = 0;
    System.out.println(Arrays.toString(people));
    int left = 0, right = people.length - 1;
    while (left <= right) {
      if (people[left] + people[right] <= limit) { // 가장 가벼운 물건과 가장 무거운 물건을 한 보트에 태우는 경우
        left++;
      }
      right--;
      count++; // 보트 수 증가
    }
    return count;
  }
}