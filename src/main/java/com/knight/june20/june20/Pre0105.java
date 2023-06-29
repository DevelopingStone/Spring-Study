package com.knight.june20.june20;

public class Pre0105 {
    public static void main(String[] args) {
        Solution0105 user = new Solution0105();
        System.out.println(user.solution("1101"));
    }
}


class Solution0105 {
    public int solution(String S) {
        int num = Integer.parseInt(S, 2);
        int count = 0;
        while (num != 0) {
            count++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
        }
        return count;
    }
}