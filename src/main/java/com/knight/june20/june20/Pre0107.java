package com.knight.june20.june20;

public class Pre0107 {

    public static void main(String[] args) {
        String A = "Hello,    !!World!!!???";
        Solution0107 user = new Solution0107();
        user.solution(A);
    }
}


class Solution0107 {
    public String[] solution(String s) {

        String[] words = s.split("[ .,!?]+");

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
        }

        return words;
    }
}