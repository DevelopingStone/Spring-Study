package com.knight.june27;

import java.util.LinkedList;
import java.util.List;

public class Pre0115 {
    public static void main(String[] args) {
        Solution0115 user = new Solution0115();
        System.out.println(user.solution(7, 3));


    }

}


class Solution0115 {

    public int solution(int N, int K) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() != 1) {
            index = (K - 1 + index) % N;
            list.remove(index);
            N--;
        }


        return list.get(0);
    }

}