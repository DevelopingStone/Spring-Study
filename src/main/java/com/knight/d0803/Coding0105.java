package com.knight.d0803;

public class Coding0105 {
}


class Solution0105 {
    public int average(int[][] image, int x, int y, int range, int K) {
        int sum = 0;
        for (int i = y - range; i <= y + range; i++) {
            for (int j = x - range; j <= x + range; j++) {
                if ((i >= 0 && i < image.length) && (j >= 0 && j < image[0].length)) {
                    sum += image[i][j];
                }
            }
        }
        return sum / (K * K);
    }

    public int[][] solution(int[][] image, int K) {
        int[][] answer = new int[image.length][image[0].length];
        int range = K / 2;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                answer[i][j] = average(image, j, i, range, K);
            }
        }

        return answer;
    }
// image배열 전체를 2중for문으로 순회하면서
// 해당지점을 2중for문으로 평균값을 구함
// 평균값을 구할 때 범위는 K이기 때문에
// 현재 인덱스에서 위아래로 ± K / 2 범위의 값들을 더한 후 K^2만큼을 나누어서 평균을 구함
// 평균배열을 return

}