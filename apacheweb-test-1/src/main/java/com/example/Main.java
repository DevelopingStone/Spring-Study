package com.example;

public class Main {
    public static void main(String[] args) {

        Solution user = new Solution();
//        System.out.println(user.solution(626331));

    }
}


class Solution {
    public double solution(int[] arr) {
        double result = 0;
        for(int num : arr){
            result+=num;
        }
        return result/arr.length;
    }
}