package com.knight.d0704;

public class Pre0109 {

    public static void main(String[] args) {
        Solution0109 user = new Solution0109();
    }
}


class Solution0109 {
    public boolean solution(boolean[][] matrix, boolean b) {
        for (boolean[] matrixArr1 : matrix) {
            for (boolean matrixArr2 : matrixArr1) {
                if (matrixArr2!=b) {
                    return false;
                }
            }
        }

        return true;
    }
}