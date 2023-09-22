package com.knight.woowacourse1;

import java.util.Arrays;

public class Coding0101 {

    public static void main(String[] args) {


        System.out.println(new Solution0101().solution(99, 102, 211, 212));


    }

}


class Solution0101 {


    public int solution(int pPage1, int pPage2, int cPage1, int cPage2) {

        int[] pResult = {plus(pPage1), multi(pPage1), plus(pPage2), multi(pPage2)};
        int[] cResult = {plus(cPage1), multi(cPage1), plus(cPage2), multi(cPage2)};


        Arrays.sort(pResult);
        Arrays.sort(cResult);
        System.out.println(Arrays.toString(pResult));
        System.out.println(Arrays.toString(cResult));

        int pMax = pResult[3];
        int cMax = cResult[3];

        if (pResult[0] == 0 || cResult[0] == 0) {
            return -1; // 예외사항
        }

        if (pMax > cMax) {
            return 1; // 포비 이김
        } else if (pMax < cMax) {
            return 2; // 크롱 이김
        } else {
            return 0; // 무승부
        }


    }

    public int plus(int num) {
        int resultSum = 0;

        while (num != 0) {
            resultSum += num % 10;
            num /= 10;
        }

        return resultSum;

    }

    public int multi(int num) {
        int resultSum = 1;

        while (num != 0) {
            resultSum *= num % 10;
            num /= 10;
        }

        return resultSum;
    }


}
