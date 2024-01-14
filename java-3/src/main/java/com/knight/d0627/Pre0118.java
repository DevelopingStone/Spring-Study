package com.knight.d0627;

import java.util.Arrays;

public class Pre0118 {
    public static void main(String[] args) {
        Solution0118 user = new Solution0118();
        int[][] city = {{0,1,1},
                        {1,0,1},
                        {1,1,1}};
        user.solution(city);
    }
}


class Solution0118 {
//    public int[][] solution(int[][] n) {
//        int[][] answer = n.clone();
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n[i].length; j++) {
//                if (n[i][j] == 1) {
//                    int a = Integer.MAX_VALUE;
//                    for (int k = 0; k < n.length; k++) {
//                        for (int l = 0; l < n[i].length; l++) {
//                            if (n[k][l] == 0 && Math.abs(i - k) + Math.abs(j - l) < a) {
//                                answer[i][j] = Math.abs(i - k) + Math.abs(j - l);
//                                a = answer[i][j];
//                            }
//                        }
//                    }
//                }
//
//
//            }
//        }
//        for(int[] i : answer){
//            System.out.println(Arrays.toString(i));
//        }
//
//
//        return answer;
//    }
public int[][] solution(int[][] n) {
    int[][] answer = new int[n.length][n[0].length];

    for (int i = 0; i < n.length; i++) {
        for (int j = 0; j < n[i].length; j++) {
            if (n[i][j] == 1) {
                answer[i][j] = calculateMinDistance(n, i, j);
            }
        }
    }

    for (int[] row : answer) {
        System.out.println(Arrays.toString(row));
    }

    return answer;
}

    private int calculateMinDistance(int[][] n, int i, int j) {
        int minDistance = Integer.MAX_VALUE;

        for (int k = 0; k < n.length; k++) {
            for (int l = 0; l < n[k].length; l++) {
                if (n[k][l] == 0) {
                    int distance = Math.abs(i - k) + Math.abs(j - l);
                    minDistance = Math.min(minDistance, distance);
                }
            }
        }

        return minDistance;
    }

}