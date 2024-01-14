package com.knight.d0810;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Coding0105 {

    public static void main(String[] args) {
        System.out.println(new Solution0105().solution(2, 20, new int[]{3, 6}, new int[]{2, 1}));
    }
}


class Solution0105 {

    public int solution(int N, int M, int[] fry, int[] clean) {
        List<Integer> fryList = new LinkedList<>();
        int sum = 0;
        int result = 0;

        if (fry.length >= M) {
            Arrays.sort(fry);
            return fry[M - 1];
        }

        for (int i = 1; i <= M; i++) {
            for (int j = 0; j < fry.length; j++) {
                fryList.add((fry[j] + clean[j]) * i);
            }
        }

        Collections.sort(fryList);
        System.out.println(fryList);




        for (int i = 0; i < fry.length; i++) {
            if (fryList.get(M - 1) % (fry[i] + clean[i]) == 0) {

                return result = fryList.get(M - 1) - clean[i];
            }

        }


        return result;
    }
}