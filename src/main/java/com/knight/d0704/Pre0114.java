package com.knight.d0704;

public class Pre0114 {
    public static void main(String[] args) {
        Solution0114 user = new Solution0114();
//        System.out.println(user.solution(292, 153));
    }
}


class Solution0114 {

    public int solution(int A) {
        int count = 0;
        final int[] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        for (int money : moneyArr) {
            if (A / money >= 1) {
                int index = A / money;
                A = A - (money * index);
                count += index;
            }
        }

        return count;
    }

}