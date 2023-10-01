package com.knight.woowacourse2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int game = 1;
        while (game == 1) {
            BaseballGameController player = new BaseballGameController();
            Scanner scan = new Scanner(System.in);

            player.randomNumber();
//        랜덤 숫자 생성
            System.out.println("숫자 야구 게임을 시작합니다.");


            while (player.strike != 3) {
                System.out.print("숫자를 입력해주세요 : ");
                int num = scan.nextInt();
                player.playerNumber(num);
//        플레이어 숫자 생성
                player.comparisonNum();
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");


            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
            game = scan.nextInt();

        }

        System.out.print("게임이 종료 되었습니다.");
    }

}
