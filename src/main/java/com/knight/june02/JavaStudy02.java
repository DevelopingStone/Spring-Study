package com.knight.june02;

/*
박강락
 */
import java.util.Scanner;

public class JavaStudy02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[캐쉬백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int money = scan.nextInt();
        int rest = money / 10;
        if (rest <= 100 && rest >= 0) {
            rest = 0;
        } else if (rest >= 100 && rest <= 199) {
            rest = 100;
        } else if (rest >= 200 && rest <= 299) {
            rest = 200;
        } else if (rest >= 300) {
            rest = 300;
        }
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", money, rest);
    }
}
