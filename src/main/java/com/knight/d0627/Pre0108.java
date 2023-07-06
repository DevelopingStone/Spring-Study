package com.knight.d0627;

public class Pre0108 {

    public static void main(String[] args) {

        Solution0108 user = new Solution0108();
        System.out.println(user.solution(15));
    }

}

class Solution0108 {
    public int solution(int n) {
//        int num = (int) Math.cbrt(n);
//        return (int) Math.pow(num, 3);

        return (int) Math.pow((int) Math.cbrt(n), 3);


    }
}