package com.knight.d0803;

import java.util.*;

public class Coding0104 {
    public static void main(String[] args) {
        System.out.println(new Solution0104().solution(new int[]{4, 2, 7, 2, 6}, new int[]{5, 2, 5, 4, 3}));
    }

}


class Work {
    int start;
    int time;
    int index;

    public Work(int start, int time, int index) {
        this.start = start;
        this.time = time;
        this.index = index;
    }
}

class Solution0104 {
    public int[] solution(int[] start, int[] time) {
        int n = start.length;
        Work[] works = new Work[n];

        // work 객체 생성
        for (int i = 0; i < n; i++) {
            works[i] = new Work(start[i], time[i], i);
        }

        // 작업시간 기준 오름차순 정렬
        Arrays.sort(works, Comparator.comparingInt(j -> j.start));

        // 작업시간 기준 우선순위 큐(시간, 인덱스 순서)
        PriorityQueue<Work> pq = new PriorityQueue<>((j1, j2) -> {
            if (j1.time == j2.time) {
                return j1.index - j2.index;
            }
            return j1.time - j2.time;
        });

        // 작업 순서를 저장할 리스트
        List<Integer> order = new ArrayList<>();

        int currentTime = 0; // 현재시간
        int i = 0; // 인덱스

        while (i < n || !pq.isEmpty()) {
            if (pq.isEmpty()) {
                currentTime = Math.max(currentTime, works[i].start);
            } // 처리 할 작업이 없는 경우 시간 건너뜀

            while (i < n && works[i].start <= currentTime) {
                pq.offer(works[i]);
                i++;
            } // 작업시간이 현재시간 이하인 애들은 큐에 계속 넣음
            // 이 과정에서 소요시간이 짧은 애들이 앞으로 감
            // 소요시간이 같은 애들은 인덱스 순서

            Work currentWork = pq.poll(); // 맨 앞의 작업이 현재 작업
            order.add(currentWork.index); // 현재작업의 인덱스 넣음
            currentTime += currentWork.time;
            // 현재작업 시간만큼 흘러가니까 더함
        }

        return order.stream().mapToInt(Integer::intValue).toArray();
    }
}