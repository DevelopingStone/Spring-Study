package com.knight.d0907;

import java.util.HashMap;
import java.util.Map;

public class Coding0102 {
    public static void main(String[] args) {

        System.out.println(new Solution0102().solution(new int[]{4, 3, 2, 3, 3, 3, 3, 1, 2, 2, 3}));


    }
}


class Solution0102 {
    public int solution(int[] votes) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int vote : votes) {
            int value = map.getOrDefault(vote, 0);
            map.put(vote, value + 1);
            System.out.println(map);
            if (value >= votes.length / 2) {
                return vote;
            }

        }

        return 0;
    }
}