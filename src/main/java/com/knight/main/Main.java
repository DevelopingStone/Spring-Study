package com.knight.main;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution(0);

        int[] pri = {1, 3, 2, 2, 4, 3};
        int location = 3;

//        System.out.println(user.solution(pri, location));



        user.solution(10);

    }
}




class Solution{

    int top = -1;
    int[] arraySize ;

    public Solution(int array) {
        arraySize = new int[array];
        this.top = top;
    }

    public void solution(int value){

        if(top== arraySize.length-1){
            System.out.println("Arrays size is zero, Please size add up");
            return ;
        }

        arraySize[++top] = value;

        System.out.println("arraySize[0] = " + arraySize[0]);
        
    }
    
}