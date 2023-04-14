package com.knight.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 요세푸스 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int result = scan.nextInt();
    int n = scan.nextInt();

    요세푸스 user = new 요세푸스();
    System.out.println(user.solution(result,n));

  }
  public List<Integer> solution(int result, int n) {
    List<Integer> list = new ArrayList<>();
    List<Integer> listResult = new ArrayList<>();
    for(int i=1; i<=result; i++){
      list.add(i);
    }
    int index = 0;
    while (!list.isEmpty()) {
      index = (index + n - 1) % list.size(); // 제거할 요소의 인덱스 계산
      listResult.add(list.remove(index));

    }

    return listResult;

  }
}




