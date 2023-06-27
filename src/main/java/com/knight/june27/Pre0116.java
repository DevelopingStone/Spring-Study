package com.knight.june27;

public class Pre0116 {
}


class Solution0116 {
    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append((char) num);
        }
        return sb.toString();
    }
}