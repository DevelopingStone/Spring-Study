package com.knight.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Solution user = new Solution();
//        int[] arr = {100, 50, 70, 90, 75, 87, 105, 78, 110, 60};
//        System.out.println(user.solution(arr, 6));


    }
}




class StockTrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = scanner.nextInt(); // 주가를 알 수 있는 날 수
            int K = scanner.nextInt(); // 거래 회수
            int[] prices = new int[N]; // 주가 배열

            // 주가 입력 받기
            for (int i = 0; i < N; i++) {
                prices[i] = scanner.nextInt();
            }

            boolean isPossible = canBuyStocks(N, K, prices);
            System.out.println("Case #" + testCase);
            System.out.println(isPossible ? 1 : 0);
        }

        scanner.close();
    }

    public static boolean canBuyStocks(int N, int K, int[] prices) {
        int count = 0; // 구입한 주식의 개수

        for (int i = 1; i < N; i++) {
            if (prices[i] > prices[i - 1]) {
                count++;
                if (count == K) {
                    return true; // 주어진 조건을 만족하는 주식 구매가 가능
                }
            }
        }

        return false; // 주어진 조건을 만족하는 주식 구매가 불가능
    }
}




