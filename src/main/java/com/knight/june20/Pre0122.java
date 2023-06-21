package com.knight.june20;

public class Pre0122 {

    public static void main(String[] args) {

    }
}


class Solution0122 {
    public boolean solution(int n) {

        for (int i = 2; i <= n; i++) {
            if (n == i) {
                return true;
            } else if (n % i == 0) {
                return false;
            }
        }


        return true;
    }
}