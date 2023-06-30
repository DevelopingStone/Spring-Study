package com.knight.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();


        int[] reserve = {70, 50, 80, 50};
        System.out.println(user.solution(reserve, 100));


    }
}


class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        for (int i = 0, j = people.length - 1; j > i; j--) {
            if (people[i] + people[j] <= limit) {
                count++;
                i++;
            }
        }
        System.out.println("count = " + count);
        return people.length - count;
    }
}