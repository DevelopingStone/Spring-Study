package com.knight.june02;

import java.util.*;

public class JavaStudy07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int repetition = 6;

        List<List<Integer>> myLotto = new ArrayList<>();
        List<Integer> RandomLotto;

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10): ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            RandomLotto = new ArrayList<>();
            while (repetition > 0) {
                int number = random.nextInt(45) + 1;
                if (RandomLotto.contains(number)) {
                    continue;
                }
                RandomLotto.add(number);
                repetition--;
            }
            Collections.sort(RandomLotto);
            myLotto.add(RandomLotto);
            repetition = 6;

        }

        for (int i = 0; i < myLotto.size(); i++) {
            System.out.println((char) ('A' + i) + "   " + myLotto.get(i));
        }

        System.out.println("\n[로또 발표]");

        RandomLotto = new ArrayList<>();
        while (repetition > 0) {
            int number = random.nextInt(45) + 1;
            if (RandomLotto.contains(number)) {
                continue;
            }
            RandomLotto.add(number);

            repetition--;
        }

        Collections.sort(RandomLotto);
        System.out.println("    " + RandomLotto + "\n");

        System.out.println("[내 로또 결과]");

        for (int i = 0; i < myLotto.size(); i++) {
            int count = 0;
            for (int numCount : RandomLotto) {
                if (myLotto.get(i).contains(numCount)) {
                    count++;
                }
            }
            System.out.println((char) ('A' + i) + "   " + myLotto.get(i) + " => " + count + "개 일치");
        }
    }
}
