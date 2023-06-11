package com.knight.main;


import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        Solution user = new Solution();
        System.out.println(user.solution(plays));

    }
}

class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;

            System.out.println(Arrays.toString(stack));
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}