package com.knight.d0720;

public class Coding0104 {
    public static void main(String[] args) {
        System.out.println(new Solution0104().solution(5, 5, new int[]{3, 2, 0, 0, 2, 3, 0, 0, 2, 2, 5}));
    }

}


class Solution0104 {
    public int solution(int delay, int capacity, int[] times) {
        int aReturn = 0, aTime = 0, count = 0;
//    순서대로 초과되는수, 현재지난시간, 큐상태

        for (int time : times) {
            count++; //하나의 큐가 나올때마다 큐가 1개 쌓인다.

            aTime += time; //하나의 큐가 나올때 현재 지난시간  aTime

            if (aTime >= delay) {
                count--;
                aTime -= delay;
            }
//          위의 if 를 해석해보면,  aTime(현재 지난시간)이 delay(처리시간)만큼 지난경우 하나의 큐를 해결했으니 count-- 를 해준다
//          aTime 값에서 Delay 값을 뺴준다, aTime값이 delay 값을 초과할때마다 count-- 값을 하나씩 빼줘야하기때문

            if (count > capacity) {
                aReturn++;
                count = capacity;
            }
//            만약 count(현재쌓인큐) capacity(큐의한계) 값을 초과하는경우 손실값 aReturn++를 해주고, count(현재쌓인큐)는 capacity(큐의한계)를 초과할수없으므로
//            count = capacity 로 초기화해준다.
        }
        return aReturn;
    }
}