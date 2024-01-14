package com.knight.d0704;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Pre0125 {
    public static void main(String[] args) {

        Solution0125 user = new Solution0125();
        int[] arr = {1000,100,5000,1000,500};
        System.out.println(user.solution(arr));

    }
}


class Solution0125 {
    public List<Integer> solution(int[] arr) {
        List<Integer> changeMoney = new LinkedList<>();
        final int[] change = {500, 100, 50, 10};
        int LastMoney = 0;
        for (int arrLastMoney : arr) {
            if (arrLastMoney >= 1000) {
                LastMoney = arrLastMoney;
            }
        }
        if (LastMoney >= 1000) {
            changeMoney.add(LastMoney);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == LastMoney) {
                    arr[i] = 0;
                    break;
                }
            }
        }

        for (int arrLastMoney : arr) {
            while (arrLastMoney != 0) {
                for (int changeArr : change) {
                    if (arrLastMoney % changeArr == 0) {
                        int a = arrLastMoney / changeArr;
                        arrLastMoney -= changeArr * a;
                        while(a!=0){
                            changeMoney.add(changeArr);
                                    a--;
                        }
                    }
                }
            }

        }
        changeMoney.sort(Comparator.reverseOrder());


        return changeMoney;
    }
}