package com.knight.main;

public class HanoiTower {
    static int count = 0;

    public static void main(String[] args) {

        int n = 5; // 탑의 블록 개수
        char a = 'A'; // 출발지 기둥
        char b = 'B'; // 목적지 기둥
        char c = 'C'; // 보조 기둥

        solveHanoiTower(n, a, b, c);
        System.out.println("count = " + count);
    }

    public static void solveHanoiTower(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("1번 기둥을" + c + "로 옮깁니다.");
//            1번 3
            count++;
            return;
        }

        solveHanoiTower(n - 1, a, c, b);
//        n-1 1,3,2
        System.out.println(n + "기둥을" + c + "로 옮깁니다.");
//        n번 3
        count++;
        solveHanoiTower(n - 1, b, a, c);
//        n-1,2,1,3
    }
}

