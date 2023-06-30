package com.knight.june27;

public class Pre0116 {
    public static void main(String[] args) {


    }
}


class Solution0116 {
    int count = 0;

    public int solution(int N, int K) {

        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            count(str, Integer.toString(K));
        }
        return count;
    }

    public void count(String str, String str1) {
        for (String word : str.split("")) {
            if (str1.equals(word)) {
                count++;
            }
        }
    }
}