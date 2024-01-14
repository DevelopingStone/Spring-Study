package com.knight.woowacourse1;

import java.util.LinkedHashMap;
import java.util.Map;

class Main01 {
    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(new Solution().solution(clothes));
    }

}

class Solution {
    public int solution(String[][] clothes) {
//        Map<String, Integer> map = new HashMap<>();
//        int result = 1;
//
//        for (int i = 0; i < clothes.length; i++) {
//            int value = map.getOrDefault(clothes[i][1], 0);
//            map.put(clothes[i][1], value + 1);
//        }
//
//        System.out.println(map);
//
//        for (int value : map.values()) {
//            result *= (value + 1);
//        }
//
//        return result - 1;
        Map<String, Integer> clothe = new LinkedHashMap<>();
        int result = 1;

        for (int i = 0; i < clothes.length; i++) {
            int value = clothe.getOrDefault(clothes[i][1], 0);
            clothe.put(clothes[i][1], value + 1);
        }
        System.out.println(clothe);

        for (int value : clothe.values()) {
            result *= (value+1);
        }


        return result - 1;
    }
}
