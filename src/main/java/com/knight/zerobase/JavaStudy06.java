package com.knight.zerobase;
/*
 박강락
 */

import java.util.HashMap;
import java.util.Random;

public class JavaStudy06 {

  public static void main(String[] args) {
    Random vote = new Random();
    HashMap<Integer, String> name = new HashMap<>();
    name.put(0, "이재명");
    name.put(1, "윤석열");
    name.put(2, "심상정");
    name.put(3, "안철수");

    int[] votes = new int[name.size()];
    int result = 0;

    for (int i = 1; i <= 100000; i++) {
      int num = vote.nextInt(votes.length);
      votes[num]++;
      System.out.printf("[투표진행율] : %.2f%%, %d명 투표 => %s\n", ((double) i / 1000), i, name.get(num));
      for (int j = 0; j < votes.length; j++) {
        System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", j + 1, name.get(j),
            ((double) votes[j] / 100000) * 100, votes[j]);
      }

    }

    int maxIndex = 0;
    for (int i = 1; i < votes.length; i++) {
      if (votes[i] > votes[maxIndex]) {
        maxIndex = i;
      }
    }

    System.out.println("[투표결과] 당선인 : " + name.get(maxIndex));


  }
}


