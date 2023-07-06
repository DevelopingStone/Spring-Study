package com.knight.d0602;

/*
 박강락
 */
import java.util.Random;
import java.util.Scanner;

public class JavaStudy04 {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요. (yyyy) : ");
        String yyyy = scan.next();

        System.out.print("출생월을 입력해 주세요. (mm) : ");
        int mm = scan.nextInt();

        System.out.print("출생일을 입력해 주세요. (dd) : ");
        int dd = scan.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f) : ");
        String sex = scan.next();

        System.out.printf("%s%02d%02d-", yyyy.substring(2, 4), mm, dd);

        if ("m".equals(sex)) {
            System.out.print(3);
        } else {
            System.out.print(4);
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(random.nextInt(10));
        }


    }


}
