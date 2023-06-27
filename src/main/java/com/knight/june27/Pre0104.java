package com.knight.june27;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pre0104 {
    public static void main(String[] args) {
        Solution0104 user = new Solution0104();
//        System.out.println(user.solution("552342502"));
    }
}

class Solution0104 {
    public int solution(String s) {
        Set<String> set = new LinkedHashSet<>();
        for (String word : s.split(" ")) {
            set.add(word);
        }
        return set.size();
    }
}