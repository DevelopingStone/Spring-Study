package com.knight.june20;

import java.util.HashSet;

public class Pre0115 {

}


class Solution0115 {
    public String solution(String[] bj, String[] one, String[] two) {
        String answer = "";
        HashSet<String> set = new HashSet<>();

        for (String str : bj) {
            set.add(str);
        }

        for (String str : one) {
            set.remove(str);
        }

        for (String str : two) {
            set.remove(str);
        }

        int reward = 150 * one.length + 300 * two.length + 450;
        String winner = set.toString().substring(1, set.toString().length() - 1);
        answer = reward + "만원" + "(" + winner + ")";

        return answer;
    }
}