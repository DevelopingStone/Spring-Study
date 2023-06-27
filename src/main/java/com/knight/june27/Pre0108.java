package com.knight.june27;

import java.util.Arrays;

public class Pre0108 {

    public static void main(String[] args) {
        int[] A = {6, 12, 4};
        Solution0108 user = new Solution0108();
        System.out.println(user.solution(A));
    }

}

class Solution0108 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int gcd = 1;
        int resultNum = 0;
        boolean tf = true;

        while (gcd > 0 && gcd <= A[0]) {
            for (int arrayNum : A) {
                if (arrayNum % gcd != 0) {
                    tf = false;
                    break;
                } else {
                    tf = true;
                }
            }
            if (tf) {
                resultNum = gcd;
            }
            gcd++;
        }

        return resultNum;
    }
}