package com.knight.main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < testCaseCount; t++) {
            int n = scanner.nextInt(); // 격자의 크기 N
            int m = scanner.nextInt(); // 격자의 크기 M
            int q = scanner.nextInt(); // 업데이트 개수 Q

            int[][] grid = new int[n][m]; // 격자 초기화
            int[] rowMax = new int[n]; // 각 행의 최댓값 저장
            int[] colMax = new int[m]; // 각 열의 최댓값 저장

            // 격자 초기 값을 입력 받음
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.nextInt();
                    rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                    colMax[j] = Math.max(colMax[j], grid[i][j]);
                }
            }

            int safeCells = 0; // 안전한 셀의 개수

            // 초기 안전한 셀의 개수 계산
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == rowMax[i] || grid[i][j] == colMax[j]) {
                        safeCells++;
                    }
                }
            }

            // 업데이트 수행 및 안전한 셀의 개수 업데이트
            for (int i = 0; i < q; i++) {
                int r = scanner.nextInt() - 1; // 셀의 위치 (0부터 시작하도록 조정)
                int c = scanner.nextInt() - 1;
                int x = scanner.nextInt();

                // 기존의 최댓값보다 큰 값으로 업데이트되는 경우, 최댓값 업데이트
                if (x > rowMax[r]) {
                    rowMax[r] = x;
                    // 업데이트된 셀이 안전한 셀인 경우, 안전한 셀의 개수 증가
                    if (grid[r][c] == rowMax[r] || grid[r][c] == colMax[c]) {
                        safeCells++;
                    }
                }
                if (x > colMax[c]) {
                    colMax[c] = x;
                    if (grid[r][c] == rowMax[r] || grid[r][c] == colMax[c]) {
                        safeCells++;
                    }
                }

                grid[r][c] = x; // 격자 값 업데이트

                // 업데이트 결과 출력
                System.out.println(safeCells);
            }
        }

        scanner.close();
    }
}

