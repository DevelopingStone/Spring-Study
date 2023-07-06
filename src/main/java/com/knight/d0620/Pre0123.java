package com.knight.d0620;

public class Pre0123 {
    public static void main(String[] args) {
        Solution0123 user = new Solution0123();
        System.out.println(user.solution("apple"));

    }
}

class Solution0123 {
    public String solution(String s) {
//        StringBuilder sb = new StringBuilder();
//        return sb.append(s).reverse().toString();
         return new StringBuffer(s).reverse().toString();
    }
}