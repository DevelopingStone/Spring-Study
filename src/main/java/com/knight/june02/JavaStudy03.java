package com.knight.june02;
/*
박강락
 */
import java.util.Scanner;

public class JavaStudy03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = scan.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = scan.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit1 = scan.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String merit2 = scan.next();
        int money = 10000;

        if(age<3){
            money = 0;
        }
        else if (age<13){
            money = 4000;
        }
        else if (time>=17){
            money = 4000;
        }
        else if("y".equals(merit1)||"y".equals(merit2)){
            money = 8000;
        }

        System.out.printf("입장료: %d",money);
    }
}
