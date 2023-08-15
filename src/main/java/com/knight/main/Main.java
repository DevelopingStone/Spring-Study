package com.knight.main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        변수값
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int com1 = 0, com2 = 0, com3 = 0;
        int user1 = 0, user2 = 0, user3 = 0;
        int extractNum = 0;
        int challenge = 1;


//      랜덤숫자생성
        while (true) {
            com1 = random.nextInt(10);
            com2 = random.nextInt(10);
            com3 = random.nextInt(10);
            
            

            if (!(com1 == com2 || com2 == com3 || com3 == com1)) {
                extractNum += com1 * 100 + com2 * 10 + com3;
                System.out.println("extractNum = " + extractNum);
                break;
            }

        }

        System.out.println("com1 = " + com1);
        System.out.println("com2 = " + com2);
        System.out.println("com3 = " + com3);


        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

//      사용자 정답입력
        while (true) {

            System.out.printf("%d번째 시도 : ", challenge);
            int myNum = scan.nextInt();
            user1 = myNum / 100;
            myNum -= user1 * 100;
            user2 = myNum / 10;
            myNum -= user2 * 10;
            user3 = myNum;

            challenge++;
            System.out.println("user1 = " + user1);
            System.out.println("user2 = " + user2);
            System.out.println("user3 = " + user3);


            if(com1==user1){
                S++;
            }
            else if (com1==user2){
                B++;
            }
            else if(com1 ==user3){
                B++;
            }


        }


    }
}



