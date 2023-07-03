package com.knight.main;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();

        System.out.println(user.solution("cdcd"));

//        StringBuilder sb = new StringBuilder("baabaa");
//        sb.delete(1, 3);
//        System.out.println("sb = " + sb);


    }
}


class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                i = -1;

            }
        }

        if (sb.length() == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}