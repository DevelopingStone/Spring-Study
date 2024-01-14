package com.knight.month;

import java.util.ArrayList;
import java.util.List;

public class month03 {

  public static void main(String[] args) {

    Solution03 user = new Solution03();
    int n = 2;
    int[] sweetness = {5, 2, 4};
    int[] weights = {1, 3, 2, 2, 1, 3, 3, 2};
    System.out.println(user.solution(n, sweetness, weights));
  }
}


class Solution03 {

  public int solution(int n_coffee, int[] beans, int[] orders) {
    List<Integer> order = new ArrayList<>();
    int sum = 0;
    int count = 0;

    // 커피를 주문한 순서를 리스트에 저장합니다.
    for (int i : orders) {
      order.add(i);
    }

    // 커피콩의 양을 확인하면서 최소 양의 콩을 찾아 커피를 만들어줍니다.
    for (int i = 0; i < beans.length; i++) {
      if (beans[i] <= 10) { // 콩의 양이 10보다 작거나 같은 경우
        for (int j = 0; j < order.size(); j++) {
          sum += beans[i] * (order.get(j) + 1); // 커피를 만들어서 합산합니다.

          System.out.println(sum);

          if (j >= n_coffee - 1) { // 만든 커피가 주문한 개수와 같을 때까지 반복합니다.
            break;
          }
        }
        while (count < n_coffee) { // 만든 커피 개수가 n_coffee와 같아질 때까지 order 리스트에서 제거합니다.
          order.remove(0);
          count++;
          if (order.size() == 0) { // 주문한 커피가 다 만들어진 경우
            return sum; // 총 비용을 반환합니다.
          }
        }
        count = 0;
        beans[i] = beans[i] * 2; // 콩의 양을 2배로 늘립니다.
        if (beans[i] <= 10) { // 콩의 양이 10보다 작거나 같은 경우 다시 한 번 커피를 만들어줍니다.
          i--;
        } else {
          System.out.println("산미가 10초과하여 폐기합니다."); // 콩의 양이 10보다 큰 경우 폐기합니다.
        }
      }
    }

    if (order.size() != 0) { // 만약 주문이 다 처리되지 않은 경우
      return -1; // -1을 반환합니다.
    }
    return sum; // 총 비용을 반환합니다.
  }
}
