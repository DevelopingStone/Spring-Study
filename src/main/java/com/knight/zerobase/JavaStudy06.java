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
    name.put(1, "이재명");
    name.put(2, "윤석열");
    name.put(3, "심상정");
    name.put(4, "안철수");

    int[] votes = new int[name.size()];
    int result = 0;

    for (int i = 1; i <= 100000; i++) {
      int num = vote.nextInt(votes.length) + 1;
      votes[num-1]++;
      System.out.printf("[투표진행율] : %.2f%%, %d명 투표 => %s\n", ((double) i / 1000), i, name.get(num));

    }



//      System.out.println("[투표진행율] : " + String.format("%.2f", ((double) i / 1000)) + "%, " + i + "명 투표 => "+ name.get(num));
//      System.out.printf("[기호:1] 이재명: %.2f%%,  (투표수: %d)\n", ((double) one / 100000) * 100, one);
//      System.out.printf("[기호:2] 윤석열: %.2f%%,  (투표수: %d)\n", ((double) two / 100000) * 100, two);
//      System.out.printf("[기호:3] 심상정: %.2f%%,  (투표수: %d)\n", ((double) three / 100000) * 100, three);
//      System.out.printf("[기호:4] 안철수: %.2f%%,  (투표수: %d)\n", ((double) four / 100000) * 100, four);

    for (int i = 0; i < votes.length; i++) {
      System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i + 1, name.get(i + 1),
          ((double) votes[i] / 100000) * 100, votes[i]);
    }







//    List<Integer> list = new ArrayList<>(Arrays.asList(one, two, three, four));
//    for (int i = 0; i < list.size(); i++) {
//      if (list.get(i) > list.get(result)) {
//        result = i;
//      }
//    }
//
//    System.out.println("[투표결과] 당선인 : " + name.get(result + 1));

    int maxIndex = 0;
    for (int i = 1; i < votes.length; i++) {
      if (votes[i] > votes[maxIndex]) {
        maxIndex = i;
      }
    }

    System.out.println("[투표결과] 당선인 : " + name.get(maxIndex + 1));


    }
  }


