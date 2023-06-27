package com.knight.june27;

import java.util.Arrays;

public class Pre0107 {

    public static void main(String[] args) {
        String A = "Hello,    !!World!!!???";
        Solution0107 user = new Solution0107();
        user.solution(A);
    }
}


class Solution0107 {
    public String[] solution(String s) {
        // 입력 문자열을 공백을 기준으로 단어로 분리하여 배열에 저장
        String[] words = s.split("[ .,!?]+");


        // 단어 배열을 뒤집음
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
        }

        System.out.println(Arrays.toString(words));

        return words;
    }



}