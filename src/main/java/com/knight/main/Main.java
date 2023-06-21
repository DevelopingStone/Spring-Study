package com.knight.main;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();

        System.out.println(user.factorial(5));

    }
}


class Solution {

    public int factorial(int value){
        if(value<=2){
            return 1;
        }

        return factorial(value-1) + factorial(value-2);
    }

}