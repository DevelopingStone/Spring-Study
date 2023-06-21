package com.knight.june20;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pre0121 {

    public static void main(String[] args) {

        Solution0121 user = new Solution0121();

        System.out.println(user.solution("ooggle"));
    }
}

class Solution0121 {
    public Character solution(String s) {
        Character[] ch = new Character[s.length()];
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        char mKey = 0;
        int mValue = 0;

        for (Character word : ch) {
            int value = map.getOrDefault(word, 0);
            map.put(word, value + 1);
        }
        System.out.println("map = " + map);

        for (Map.Entry<Character, Integer> word : map.entrySet()) {
            if (word.getValue() > mValue) {

                mKey = word.getKey();
                mValue = word.getValue();

            } else if (word.getValue() == mValue) {
                if (mKey > word.getKey()) {

                    mKey = word.getKey();
                    mValue = word.getValue();

                }
            }
        }

        return mKey;
    }
}