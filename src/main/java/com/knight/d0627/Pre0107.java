package com.knight.d0627;

import java.util.LinkedList;
import java.util.List;

public class Pre0107 {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 3, 2, 4, 4};
        Solution0106 user = new Solution0106();
//        System.out.println(user.solution(arr));
    }
}


class Solution0107 {
    public List<Integer> solution(int[] arr) {
        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (result.size() >= arr.length) {
                return result;
            } else if (arr[i] % 2 == 1) {
                result.add(arr[i]);
                if (result.size() >= arr.length) {
                    return result;
                }
                result.add(arr[i]);
            } else if (arr[i] % 2 == 0) {
                result.add(arr[i]);
            }

        }

        return result;
    }


}