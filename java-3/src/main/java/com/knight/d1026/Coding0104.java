package com.knight.d1026;

import java.util.PriorityQueue;

public class Coding0104 {

    public static void main(String[] args) {


    }


}


class Solution0104 {
    public int solution(int[][] heights) {
        int N = heights.length;
        int M = heights[0].length;


        int[][] visited = new int[N][M];


        PriorityQueue<Item> pq = new PriorityQueue<>();
        pq.offer(new Item(0, 0, 0));

        int maxEffort = -1;
        while (!pq.isEmpty()) {
            Item curr = pq.poll();
            maxEffort = curr.effort;
            int i = curr.i;
            int j = curr.j;


            if (i == N-1 && j == M-1) {
                break;
            }


            if (visited[i][j] > 0) {
                continue;
            }


            visited[i][j] = 1;


            if (i > 0) {
                int effort = Math.abs(heights[i][j] - heights[i-1][j]);
                pq.offer(new Item(Math.max(maxEffort, effort), i-1, j));
            }
            if (i < N-1) {
                int effort = Math.abs(heights[i][j] - heights[i+1][j]);
                pq.offer(new Item(Math.max(maxEffort, effort), i+1, j));
            }
            if (j > 0) {
                int effort = Math.abs(heights[i][j] - heights[i][j-1]);
                pq.offer(new Item(Math.max(maxEffort, effort), i, j-1));
            }
            if (j < M-1) {
                int effort = Math.abs(heights[i][j] - heights[i][j+1]);
                pq.offer(new Item(Math.max(maxEffort, effort), i, j+1));
            }
        }

        return maxEffort;

    }
}

class Item implements Comparable<Item> {
    int effort;
    int i;
    int j;

    public Item(int effort, int i, int j) {
        this.effort = effort;
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(Item o) {
        return effort - o.effort;
    }
}
