package com.knight.woowacourse2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BaseballGameController {

    List<Integer> randomNumList = new LinkedList<>();
    int[] inputValue = new int[3];
    int ball = 0;
    int strike = 0;


    public List<Integer> randomNumber() {

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(9) + 1;
            if (!randomNumList.contains(num)) {
                randomNumList.add(num);
            } else {
                i--;
            }
        }
        return randomNumList;
    }

    public void playerNumber(int num) {

        inputValue[0] = num / 100;
        num -= inputValue[0] * 100;
        inputValue[1] = num / 10;
        num -= inputValue[1] * 10;
        inputValue[2] = num;

        if (inputValue[0] == inputValue[1] || inputValue[0] == inputValue[2] || inputValue[1] == inputValue[2]) {
            throw new IllegalArgumentException("서로 다른 수로 이루어진 3자리를 입력해주세요. " + " 잘못된 값으로 시스템을 종료합니다.");

        }
    }

    public void comparisonNum() {
        ball = 0;
        strike = 0;

        extracted();

        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (ball >= 1 && strike == 0) {
            System.out.println(ball + "볼");
        } else if (ball == 0) {
            System.out.println(strike + "스트라이크");
        } else {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        }
    }

    private void extracted() {
        for (int i = 0; i < 3; i++) {
            extracted(i);
        }
    }

    private void extracted(int i) {
        for (int j = 0; j < 3; j++) {

            extracted(i, j);

        }
    }

    private void extracted(int i, int j) {
        if (inputValue[i] == randomNumList.get(j) && i == j) {
            strike++;
        } else if (inputValue[i] == randomNumList.get(j) && i != j) {
            ball++;
        }
    }


}
