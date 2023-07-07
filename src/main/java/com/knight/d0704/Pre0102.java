package com.knight.d0704;

import java.util.Arrays;

public class Pre0102 {
    public static void main(String[] args) {
        Solution0102 user = new Solution0102();
//        int[] arr = {1, 0, 2, 3, 0, 0};
        int[] arr = {1, 0, 0, 0, 0};
        System.out.println(user.solution(arr));
    }
}




class Solution0102 {
    public int solution(int[] arr) {

        Arrays.sort(arr);
        int count = 0, people = arr.length / 2, index = arr.length - 1, tmp = 0;
        // count 학점받는인원, people 과반수, index 위치확인, tmp 마지막성적인원보관

        while (people > count || arr[index] == tmp) {
            tmp = arr[index];
            index--;
            count++;
            if (index < 0) {
                return count;
            }

            System.out.println("count = " + count);
        }
        return count;
    }
}