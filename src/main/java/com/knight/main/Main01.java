package com.knight.main;

public class Main01 {

    public static void main(String[] args) {

        System.out.println(new Solution01().solution("He11oWor1d", "lloWorl", 2));

    }
}


class Solution01 {
    public String solution(String my_string, String overwrite_string, int s) {

        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, overwrite_string.length() + s, overwrite_string);
        return sb.toString();
    }
}
