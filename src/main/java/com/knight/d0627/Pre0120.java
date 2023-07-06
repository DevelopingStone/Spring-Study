package com.knight.d0627;

public class Pre0120 {
    public static void main(String[] args) {

    }
}


class Solution0120 {
    public boolean solution(int[] bridge, int jumpSize) {
        int zeroCount = 0;
        for (int bridgeNum : bridge) {
            if (bridgeNum == 0) {
                zeroCount++;
                if (zeroCount == jumpSize + 1) {
                    return false;
                }
            } else {
                zeroCount = 0;
            }

        }

        return true;
    }
}