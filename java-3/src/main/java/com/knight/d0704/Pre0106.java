package com.knight.d0704;

public class Pre0106 {


}


class Solution0106 {

    public int solution(String s, int n) {
        int count = 0;
        for (String str : s.split("")) {
            if (Integer.toString(n).equals(str)) {
                count++;
            }
        }
        return count;
    }


}