package com.knight.d0803;

import java.util.ArrayList;
import java.util.List;

public class Coding0102 {
    public static void main(String[] args) {

        new Solution0102().solution(
                new String[]{"zero", "base", "students", "are", "the", "best"},
                new String[]{"z*", "*e", "s*"}
        );

    }
}


class Solution0102 {
    public List<Integer> solution(String[] words, String[] queries) {
        List<Integer> result = new ArrayList<>();

        for (String qu : queries) {
            String a = qu.replaceAll("\\*", "");
            int i = 0;

            for (String wo : words) {
                if (qu.charAt(0) == '*' && wo.endsWith(a)) {
                    i++;
                } else if (wo.startsWith(a) && qu.charAt(0) != '*') {
                    i++;
                }
            }

            result.add(i);
        }

        return result;
    }
}