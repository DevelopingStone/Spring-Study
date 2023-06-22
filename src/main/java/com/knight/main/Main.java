package com.knight.main;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();

        int[] list = {2, 4};
        int[] reserve = {1, 3, 5};
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(user.solution(babbling));


    }
}


class Solution {
    public int solution(String[] babblings) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for (int i = 0; i < babblings.length; i++) {
            if (babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }
            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");

            if ("".equals(babblings[i])) answer++;


        }

        return answer;
    }
}