package com.knight.d0704;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Month01 {
    public static void main(String[] args) {
        Solution01 user = new Solution01();
        int[] arrive = {12,4,5,2,7,16};
        int[] patience = {4,6,1,3,3,2};
        System.out.println(user.solution(arrive, patience));
    }
}


class Solution01 {
    public int solution(int[] arrive, int[] patience) {
        int count = 0;
        TreeMap<Integer, Integer> mateMapTmp = new TreeMap<>();
        for (int i = 0; i < arrive.length; i++) {
            mateMapTmp.put(arrive[i], patience[i]);
        }


        Map<Integer, Integer> mateMap = new LinkedHashMap<>();
        

        for (Map.Entry<Integer, Integer> mateList : mateMapTmp.entrySet()) {
//            System.out.println("mateList = " + mateList);
            for (int j = mateList.getKey(); j <= mateList.getValue()+mateList.getKey(); j++) {


                int value = mateMap.getOrDefault(j, 0);
                mateMap.put(j, value + 1);
                System.out.println("mateList = " + mateList);
                System.out.println("mateMap = " + mateMap);
                if ((value + 1) % 2 == 0) {
                    break;
                }


            }
        }



        for (Map.Entry<Integer, Integer> mateList : mateMap.entrySet()) {
            if (mateList.getValue() >= 2) {
                count += mateList.getValue();
            }
        }


        return count;
    }
}