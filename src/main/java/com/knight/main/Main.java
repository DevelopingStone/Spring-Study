package com.knight.main;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();

//        String number = "1924";
//        int k = 2;
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(user.solution(board, moves));
//
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        System.out.println(user.solution(clothes));


    }
}


class Solution {
    public int solution(int[][] board, int[] moves) {
        int[][] doll = board.clone();
        Deque<Integer> deque = new LinkedList<>();
        int count = 0;

        for (int mvNum : moves) {
            for (int i = 0; i < doll[0].length; i++) {
                if (doll[i][mvNum - 1] > 0) {
                    if (!deque.isEmpty() && deque.peekLast() == doll[i][mvNum - 1]) {
                        count += 2;
                        deque.removeLast();
                        doll[i][mvNum - 1] = 0;
                        break;
                    } else {
                        deque.addLast(doll[i][mvNum - 1]);
                        doll[i][mvNum - 1] = 0;
                        break;
                    }
                }
            }
        }
        return count;
    }
}