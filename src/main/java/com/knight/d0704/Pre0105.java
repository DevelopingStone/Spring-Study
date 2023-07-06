package com.knight.d0704;

public class Pre0105 {
    public static void main(String[] args) {
        Solution0105 user = new Solution0105();
        System.out.println(user.solution(20,5));
    }
}


class Solution0105 {
    public int solution(int n, int price) {
        return (n - (n / 11)) * price;
        // 11개마다 한개씩 차감하므로 11의 몫을 빼줌
    }
}