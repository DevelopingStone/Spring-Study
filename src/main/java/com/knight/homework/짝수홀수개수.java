package com.knight.homework;

public class 짝수홀수개수 {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5};
    Main8 user = new Main8();
    user.solution(array);


  }

}

class Main8 {

  int 홀수 = 0;
  int 짝수 = 0;

  public int[] solution(int[] num_list) {
    int[] answer = new int[2];

    for (int i : num_list) {
      if (i % 2 == 0) {
        홀수++;
      } else {
        짝수++;
      }
    }
    answer[0] = 짝수;
    answer[1] = 홀수;

    return answer;
  }


}
