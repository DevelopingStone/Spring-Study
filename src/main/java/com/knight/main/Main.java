package com.knight.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println(new Solution().solution(new int[]{1, 5, 7, 10, 5, 3}));


    }
}



class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(char ch : a.toCharArray()){
            if(ch>='a'&&ch<='z'){
                sb.append((char)(ch-32));
            }
            else{
                sb.append((char)(ch+32));
            }
        }

        System.out.println("sb = " + sb);

    }
}