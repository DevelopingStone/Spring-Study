package com.knight.june20;

public class Pre0120 {
    public static void main(String[] args) {

    }
}


class Solution0120 {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

        }
        System.out.println("sb.toString() = " + sb.toString());
//        return sb.deleteCharAt(sb.length() - 1).toString();
        return sb.substring(0, sb.length() - 1);

    }
}