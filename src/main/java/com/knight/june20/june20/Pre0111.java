package com.knight.june20.june20;

import java.util.LinkedList;
import java.util.List;

public class Pre0111 {
    public static void main(String[] args) {
        Solution0111 user = new Solution0111();
        System.out.println(user.solution("caacddefg"));
    }
}

class Solution0111 {
    public String solution(String s) {
        List<String> list = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (String word : s.split("")) {
            if (list.contains(word)) {
                list.remove(word);
            } else {
                list.add(word);
            }
        }
        for (String word : list) {
            result.append(word);
        }


        return result.toString();
    }
}