package com.knight.d0627;

public class Pre0119 {

    public static void main(String[] args) {
        Solution0119 user = new Solution0119();


    }
}

class Solution0119 {
    public int solution(int[] arr) {
        int count = 0, countTmp = 0;

        for (int arrA : arr) {
            if (arrA == 1) {
                countTmp++;
                if (countTmp > count) {
                    count = countTmp;
                }

            } else {
                countTmp = 0;
            }

            System.out.println("countTmp = " + countTmp);
        }


        return count;
    }
}