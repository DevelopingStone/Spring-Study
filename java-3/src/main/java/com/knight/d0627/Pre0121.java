package com.knight.d0627;

public class Pre0121 {

    public static void main(String[] args) {

        Solution0121 user = new Solution0121();

        System.out.println(user.solution("a a a       every", "every"));
    }
}

class Solution0121 {

    public int solution(String sentence, String word) {
        int count = -1;

        String[] arr = sentence.split(" ");

        for (String str : arr) {

            if (str.isEmpty()) {
                continue;
            }
            count++;
            if (word.equals(str)) {
                return count;
            }

        }
        return -1;
    }
}