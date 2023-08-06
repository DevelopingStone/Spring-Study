package com.knight.d0803;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Coding0105 {
}



class Solution {

    public int[][] solution(int[][] buildings) {
        int[][] keyPoints = new int[buildings.length*2][3];
        // 모든 건물의 키포인트 배열(좌상, 우하 키포인트의 좌표값)
        List<int[]> list = new ArrayList<>();
        // 실루엣 키포인트(모든 키포인트에서 있을 수 없는 키포인트들을 제거)
        int width = 0;
        // 가로길이
        int i = 0;

        for (int[] building: buildings) {
            int[] k1 = {building[0], building[2], building[2]};
            int[] k2 = {building[1], 0, building[2]};
            keyPoints[i++] = k1;
            keyPoints[i++] = k2;

            width = Math.max(width, building[1]);
        } // 모든 건물의 키포인트 구하기(겹치는 것을 고려하지 않은 그냥 전체 키포인트)

        int[] maxHeight = new int[width + 1];
        // 가로길이마다 건물의 최대높이를 기록

        for (int[] building: buildings) {
            for (int j = building[0]; j <= building[1]; j++) {
                maxHeight[j] = Math.max(maxHeight[j], building[2]);
            }
        } // 가로길이 별 최대 건물높이

        for (int[] keyPoint: keyPoints) {
            int x = keyPoint[0];
            int y = keyPoint[1];
            int myHeight = keyPoint[2];

            if (y != 0 && maxHeight[x] <= y) {
                list.add(new int[]{x, y});
                continue;
            } // 좌상 키포인트
            if (y == 0 && x + 1 < maxHeight.length && maxHeight[x + 1] < myHeight) {
                list.add(new int[]{x, maxHeight[x + 1]});
                continue;
            } // 우하 키포인트(값이 바뀌는 경우)
            if (y == 0 && maxHeight[x] == myHeight) {
                list.add(new int[]{x, 0});
            } // 우하 키포인트(값 안바뀌는 경우)
        }// 키포인트들을 꺼내서
        // 좌상 키포인트는 사라지거나 남아있거나
        // 우하 키포인트는 그대로거나 y값이 바뀌거나

        list.sort(Comparator.comparingInt(o -> o[0]));
        // 가로길이 오름차순 정렬

        int[][] answer = new int[list.size()][2];
        i = 0;
        for (int[] arr: list) {
            answer[i++] = arr;
        } // list -> arr

        return answer;
    }
}