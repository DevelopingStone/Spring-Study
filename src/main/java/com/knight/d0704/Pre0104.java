package com.knight.d0704;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pre0104 {
    public static void main(String[] args) {
        Solution0104 user = new Solution0104();
//        System.out.println(user.solution("552342502"));
    }
}

class Solution0104 {
    public String solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count == 2 && s.charAt(i) == '1') {
                return "NO";
            }
            if (s.charAt(i) == '1') {
                i += 2;
                count++;
            }
        }
        return "YES";

    }
}