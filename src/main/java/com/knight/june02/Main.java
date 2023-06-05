package com.knight.june02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution user = new Solution();
        int[] rank = {1, 2, 3};
        boolean[] attendance = {true, true, true};

    }
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], attendance[i]);
        }

        for (int i = 0; i < rank.length; i++) {
            if (map.get(i + 1)) {
                result.add(i + 1);
            }
        }

        for (Integer resultNum : result) {
            for (int i = 0; i < rank.length; i++) {
                if (resultNum == rank[i]) {
                    num.add(i);
                }
                if (num.size() == 3) {
                    break;
                }
            }
        }
        return (num.get(0) * 10000) + (num.get(1) * 100) + (num.get(2));


    }
}