package com.knight.d0824;

import java.util.Arrays;

public class Coding0101 {
    public static void main(String[] args) {

        System.out.println(new Solution0101().solution("zerobasestudentsbest", "etsnreaebbtosuztdess"));


    }
}

class Solution0101 {
    public boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();

        Arrays.sort(chS);
        Arrays.sort(chT);

        if (Arrays.equals(chS, chT)) {
            return true;
        } else {
            return false;
        }

    }
}
