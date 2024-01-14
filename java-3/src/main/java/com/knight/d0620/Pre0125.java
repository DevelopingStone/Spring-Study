package com.knight.d0620;

public class Pre0125 {
    public static void main(String[] args) {

        Solution0125 user = new Solution0125();
        System.out.println(user.solution("Naver"));

    }
}


class Solution0125 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) < 'z') {
                sb.append((char) (s.charAt(i) - 32));
            } else {
                sb.append((char) (s.charAt(i) + 32));
            }
        }
        return sb.toString();
    }
}