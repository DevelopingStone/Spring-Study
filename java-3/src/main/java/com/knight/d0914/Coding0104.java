package com.knight.d0914;

public class Coding0104 {
    public static void main(String[] args) {


        System.out.println(new Solution0104().solution(new int[]{3, 4, 1, 1, 0, 3}));


    }
}

class Solution0104 {
    public boolean solution(int[] param0) {
        int sum = param0[0];


        for (int i = 0; i <= sum; i++) {
            int num = 0;
            for (int j = i + 1; j <= param0[i]; j++) {

                if (param0[i] > num) {
                    sum = param0[i] + i;
                    i = j - i;
                }

            }
            if (param0.length - 1 <= sum) {
                return true;
            }
        }


        return false;
    }
}
