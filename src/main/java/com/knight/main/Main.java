package com.knight.main;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();

        int[] pri = {1, 3, 2, 2, 4, 3};
        int location = 3;

        System.out.println(user.solution(pri, location));


    }
}




class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }


        Arrays.sort(priorities);
        int size = priorities.length-1;





        while(!que.isEmpty()){
            System.out.println("que = " + que);
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                System.out.println("priorities[size - answer] = " + priorities[size - answer]);
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}