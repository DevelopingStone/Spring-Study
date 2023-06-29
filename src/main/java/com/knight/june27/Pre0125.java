package com.knight.june27;

public class Pre0125 {
    public static void main(String[] args) {

        Solution0125 user = new Solution0125();
//        System.out.println(user.solution("Naver"));

    }
}


class Solution0125 {
    boolean minHeap(int[] arr, int idx) {
        int leftIdx = idx * 2;
        int rightIdx = idx * 2 + 1;
        boolean left = true;
        boolean right = true;

        if (leftIdx < arr.length) { // 왼쪽 자식이 있을때
            if (arr[leftIdx] < arr[idx]) { // 부모보다 클 때
                return false;
            } else { // 자식확인
                left = minHeap(arr, leftIdx);
            }
        }
        if (rightIdx < arr.length) {
            if (arr[rightIdx] < arr[idx]) {
                return false;
            } else {
                right = minHeap(arr, rightIdx);
            }
        }
        if (!left || !right) {
            return false;
        }

        return true;
    }

    public String solution(int[] arr) {
        return minHeap(arr, 1) ? "YES" : "NO";
    }
}