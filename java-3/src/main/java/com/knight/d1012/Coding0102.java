package com.knight.d1012;

public class Coding0102 {
    public String solution(String s, int k) {
        if (k >= s.length()) {
            return "0";
        }
        if (k == 0) {
            return stripLeadingZeros(s);
        }

        char[] chars = s.toCharArray();

        if (chars[1] == '0') {
            return solution(

                    stripLeadingZeros(s.substring(1)),
                    k-1);
        } else {
            int ind = 0;

            for (int i = 1; i < chars.length; i++) {
                if (chars[i-1] < chars[i]) {
                    ind = i;
                } else if (chars[i-1] != chars[i]) {
                    break;
                }
            }
            return solution(
                    s.substring(0, ind) + s.substring(ind+1),
                    k-1);
        }
    }

    String stripLeadingZeros(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c != '0') {
                return s.substring(i);
            }
        }
        return "0";
    }
}


class Solution0102 {

}