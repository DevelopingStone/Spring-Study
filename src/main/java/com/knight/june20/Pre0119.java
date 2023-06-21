package com.knight.june20;

public class Pre0119 {

    public static void main(String[] args) {
        Solution0119 user = new Solution0119();

        System.out.println(user.solution("f4"));
    }
}

class Solution0119 {
    public String solution(String s) {
        String result = "";
        int decimal = Integer.parseInt(s, 16);
        result = Integer.toString(decimal, 8);
        return result;
    }
}