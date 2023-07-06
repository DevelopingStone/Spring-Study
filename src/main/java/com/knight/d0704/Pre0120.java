package com.knight.d0704;

public class Pre0120 {
    public static void main(String[] args) {
        
    }
}


class Solution0120 {
    public int solution(String[] array, String s) {
        int count = 0;
        for(String word : array){
            if(s.contains(word)&&word.charAt(0)==s.charAt(0)){
                count++;
                System.out.println("word = " + word);
                System.out.println("count = " + count);
            }
        }

        return count;
    }
}