package com.knight.home0714;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mission2 {

    public static void main(String[] args) {
        List<Integer> smallList = new LinkedList<>();  // 좌표
        List<List<Integer>> bigList = new LinkedList<>(); // 모든좌표
        int resultX = 0, resultY = 0, resultSum = Integer.MAX_VALUE; // 나의좌표와 가장가까운 좌표 찾기

        Scanner scan = new Scanner(System.in);
        System.out.println("내 좌표 x값을 입력해 주세요.");
        int myX = scan.nextInt();
        System.out.println("내 좌표 y값을 입력해 주세요.");
        int myY = scan.nextInt();

        for (int i = 1; i <= 10; i++) { // 1~10까지 반복, 임의좌표값 입력
            System.out.printf("%d/10 번째 입력\n", i);
            System.out.println("임의의 좌표 x값을 입력해 주세요.");
            int listX = scan.nextInt();
            smallList.add(listX);

            System.out.println("임의의 좌표 y값을 입력해 주세요.");
            int listY = scan.nextInt();
            smallList.add(listY);
            int abs = (Math.abs(myX - listX)) + (Math.abs(myY - listY));

            if (!bigList.contains(smallList)) { // 좌표값이 없다면추가, 있다면 else 통해 다시실행
                if (abs < resultSum) { // 새로운좌표값이 나의좌표와 가까운경우 수정
                    resultSum = abs;
                    resultX = listX;
                    resultY = listY;
                }
                bigList.add(smallList);
                smallList = new LinkedList<>();

            } else {
                System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해주세요.");
                smallList = new LinkedList<>();
                i--;
            }

        }

        System.out.println(bigList);
        System.out.println("제일 가까운 좌표:");
        System.out.printf("(%d, %d)", resultX, resultY);
    }
}
