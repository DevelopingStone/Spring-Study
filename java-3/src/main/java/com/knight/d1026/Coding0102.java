package com.knight.d1026;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Coding0102 {
    public static void main(String[] args) {

        System.out.println(new Solution0102().solution(new int[]{10, 4, 9, 6, 8, 1, 9, 4, 10, 4, 5, 8}));


    }
}


class Solution0102 {
    public int solution(int[] nums) {
        int m = nums.length;
        int n = m / 3;

        int[] left = new int[m];
        int[] right = new int[m];

        left[n - 1] = IntStream.range(0, n)
                .map(i -> nums[i]).sum();

        PriorityQueue<Integer> pqLeft = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            pqLeft.offer(nums[i]);
        }
//         큰 순서대로 n 개의 원소 우선순위 큐 넣기

        for (int k = n; k < 2 * n; k++) {
            pqLeft.offer(nums[k]);
            left[k] = left[k - 1] + nums[k] - pqLeft.poll();
        }

        right[2 * n] = IntStream.range(2 * n, m)
                .map(i -> nums[i]).sum();

        PriorityQueue<Integer> pqRight = new PriorityQueue<>();
        for (int i = 2 * n; i < m; i++) {
            pqRight.offer(nums[i]);
        }

        for (int k = 2 * n - 1; k > n - 1; k--) {
            pqRight.offer(nums[k]);
            right[k] = right[k + 1] + nums[k] - pqRight.poll();
        }

        int result = Integer.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            result = Math.min(result, left[i] - right[i + 1]);
        }
        return result;
    }


}