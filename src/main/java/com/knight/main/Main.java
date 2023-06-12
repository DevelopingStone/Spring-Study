package com.knight.main;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};
        Solution user = new Solution();
        System.out.println(user.solution(survey, choices));

    }
}


class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        map.put('R', 0);map.put('T', 0);map.put('C', 0);map.put('F', 0);
        map.put('J', 0);map.put('M', 0);map.put('A', 0);map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] > 4) map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
            else if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            }
        }
        if (map.get('R') < map.get('T')) {
            sb.append('T');
        } else {
            sb.append('R');
        }
        if (map.get('C') < map.get('F')) {
            sb.append('F');
        } else {
            sb.append('C');
        }
        if (map.get('J') < map.get('M')) {
            sb.append('M');
        } else {
            sb.append('J');
        }
        if (map.get('A') < map.get('N')) {
            sb.append('N');
        } else {
            sb.append('A');
        }
        return sb.toString();
    }
}