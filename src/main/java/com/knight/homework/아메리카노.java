package com.knight.homework;

public class 아메리카노 {

  public static void main(String[] args) {

  }

}

class main8 {

  int 몫;
  int 나머지;

  public int[] solution(int money) {

    몫 = money / 5500;
    나머지 = money % 5500;
    int[] answer = {몫, 나머지};
    return answer;
  }
}