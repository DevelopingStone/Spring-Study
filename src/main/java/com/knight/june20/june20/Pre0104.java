package com.knight.june20.june20;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pre0104 {
    public static void main(String[] args) {
        Solution0104 user = new Solution0104();
        System.out.println(user.solution("552342502"));
    }
}

class Solution0104 {
    public int solution(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int keyReturn = 0;
        int valueReturn = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), value + 1);
        }


        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() > valueReturn) {
                keyReturn = Integer.parseInt(String.valueOf(value.getKey()));
                valueReturn = value.getValue();
            } else if (value.getValue() == valueReturn && Integer.parseInt(String.valueOf(value.getKey())) < keyReturn) {

                keyReturn = Integer.parseInt(String.valueOf(value.getKey()));
            }
        }

        return keyReturn;
    }
}