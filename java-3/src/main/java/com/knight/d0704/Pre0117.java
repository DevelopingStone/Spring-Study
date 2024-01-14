package com.knight.d0704;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Pre0117 {
    public static void main(String[] args) {

        Solution0117 user = new Solution0117();

    }
}


class Solution0117 {

    public int solution(int[] A, int K) {
        List<Integer> aList = new LinkedList<>();
        for (int arrA : A) {
            aList.add(arrA);
        }

        Collections.sort(aList, Comparator.reverseOrder());
        List<Integer> numList = new LinkedList<>();
        numList.add(0);
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.size(); j++) {
                if (i != j) {
                    int a = (aList.get(i) * 10) + aList.get(j);
                    numList.add(a);
                }
            }
        }
        System.out.println("numList = " + numList);

        return numList.get(K);
    }

}