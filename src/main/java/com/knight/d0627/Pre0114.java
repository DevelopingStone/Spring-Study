package com.knight.d0627;

public class Pre0114 {
    public static void main(String[] args) {
        Solution0114 user = new Solution0114();
        System.out.println(user.solution(292, 15));
    }
}


class Solution0114 {

    public int solution(int A, int B) {
        int XOR = A ^ B; // A와 B의 XOR 연산 결과를 저장
        int count = 0;

        // XOR를 오른쪽으로 1 비트씩 이동하면서 최하위 비트가 1인지 확인

        while (XOR != 0) {
            count += XOR & 1; // 최하위 비트가 1이면 count 증가
            XOR >>= 1; // XOR를 오른쪽으로 1 비트씩 이동
        }

        return count;
    }


}