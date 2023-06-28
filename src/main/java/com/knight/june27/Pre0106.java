package com.knight.june27;

public class Pre0106 {


}


class Solution0106 {

    public int solution(int[] useAgeArr, int fee) {
        int sum = 0;
        for (int useAge : useAgeArr) {
            sum += useAge;
        }
        return sum * fee;
    }

}