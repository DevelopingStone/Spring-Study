package com.knight.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class 프린터 {

  public static void main(String[] args) {

    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;

    Main17 user = new Main17();
    System.out.println(user.solution(priorities, location));

  }

}


class Main17 {

  public int solution(int[] priorities, int location) {
    int answer = 1;
    Deque<Integer> deque = new ArrayDeque<>();
    for (int priority : priorities) {
      deque.add(priority);
    }

    while (!deque.isEmpty()) {
      System.out.println(deque);
      int max = getMax(deque);

      int priority = deque.poll();

      if (max > priority) {
        deque.add(priority);
        if (location == 0) {
          location = deque.size();
        }
        location--;
      } else {
        if (location == 0) {
          return answer;
        }
        answer++;
        location--;
      }
    }
    return answer;
  }

  private int getMax(Deque<Integer> deque) {
    return deque.stream().max(Integer::compareTo).orElse(-1);
  }

}
