package com.knight.june02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Solution user = new Solution();
        System.out.println(user.solution(6, 3, 3, 6));


    }
}


class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int numArray : num) {
            int value = map.getOrDefault(numArray, 0);
            map.put(numArray, value + 1);
        }

        if (map.containsValue(4)) {
            return 1111 * a;
        } else if (map.containsValue(3) && map.containsValue(1)) {
            for (Map.Entry<Integer, Integer> mapNum : map.entrySet()) {
                if (mapNum.getValue() >= 3) {
                    result += mapNum.getKey() * 10;
                } else {
                    result += mapNum.getKey();
                }
            }
            return result * result;


        } else if (map.containsValue(2) && map.containsValue(1)) {
            result = 1;
            for (Map.Entry<Integer, Integer> mapNum : map.entrySet()) {
                if (mapNum.getValue() == 1) {
                    result *= mapNum.getKey();
                }
            }
            return result;


        } else if (map.containsValue(2)) {
            int[] keys = new int[2];
            int position = 0;
            for (Map.Entry<Integer, Integer> mapNum : map.entrySet()) {

                keys[position] = mapNum.getKey();
                position++;
            }
            return (keys[0] + keys[1]) * Math.abs(keys[0] - keys[1]);


        } else {
            result = 7;
            for (Map.Entry<Integer, Integer> mapNum : map.entrySet()) {
                if (mapNum.getKey() < result) {
                    result = mapNum.getKey();
                }
            }
            return result;
        }


    }
}