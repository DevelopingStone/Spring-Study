package com.knight.d0627;

public class Pre0117 {
    public static void main(String[] args) {

        Solution0117 user = new Solution0117();

    }
}


class Solution0117 {

    public int solution(int[] A) {
        int sum = 0, tmp = 0;

        for (int arrA : A) {
            tmp += arrA;
            if (tmp > sum) {
                sum = tmp;
            } else if (tmp < 0) {
                tmp = 0;
            }
        }


        return sum;
    }

}