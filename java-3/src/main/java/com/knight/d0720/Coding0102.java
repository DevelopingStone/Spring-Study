package com.knight.d0720;

import java.util.Arrays;

public class Coding0102 {
    public static void main(String[] args) {
        new Solution0102().solution(new int[]{9, 9, 5, 2, 1, 4, 6}, new int[]{1, 2, 6, 1, 0, 4, 4});
    }
}



//class Solution0102 {
//    public List<Integer> solution(int[] a, int[] b) {
//        List<Integer> aList = new LinkedList<>();
//        List<Integer> bList = new LinkedList<>();
//        List<Integer> result = new LinkedList<>();
//
//        for (int num : a) {
//            aList.add(num);
//        }
//        for (int num : b) {
//            bList.add(num);
//        }
//
//        if (aList.size() > bList.size()) {
//            int index = aList.size() - bList.size();
//            for (int i = 0; i < index; i++) {
//                bList.add(0, 0);
//            }
//        } else if (aList.size() < bList.size()) {
//            int index = bList.size() - aList.size();
//            for (int i = 0; i < index; i++) {
//                aList.add(0, 0);
//            }
//
//        }
//        int lift = 0;
//        for (int i = aList.size() - 1; i >= 0; i--) {
//            int num = aList.get(i) + bList.get(i) + lift;
//            lift = 0;
//
//            if (num >= 10) {
//                lift = 1;
//                num = num - 10;
//                result.add(0, num);
//            } else {
//                result.add(0, num);
//            }
//        }
//        if (lift == 1) {
//            result.add(0, 1);
//        }
//
//
//        return result;
//    }
//}

class Solution0102 {
    public int[] solution(int[] a, int[] b) {
        if (a.length == 0) {
            return b;
        } else if (b.length == 0) {
            return a;
        }

        int[] answer = new int[Math.max(a.length, b.length) + 1];

        int aIdx = a.length - 1;
        int bIdx = b.length - 1;

        for (int i = answer.length - 1; i >= 0; i--) {
            int aNum = aIdx >= 0 ? a[aIdx] : 0;
            int bNum = bIdx >= 0 ? b[bIdx] : 0;
            int sum = aNum + bNum;

            answer[i] = answer[i] + sum;
            if (answer[i] >= 10) {
                answer[i - 1] += 1;
                answer[i] %= 10;
            }
            aIdx--;
            bIdx--;
        }

        return answer[0] == 0 ?
                Arrays.copyOfRange(answer, 1, answer.length) :
                answer;
    }
}
// 처음에 두 배열 중 하나가 비어있으면 반대쪽 배열을 return(더할 필요가 없으므로)
// a배열길이와 b배열길이 중 제일 큰 배열보다 한 칸 더 큰 배열 생성
// (두 수를 더하면 최대 한 자리수가 더 올라갈 수 있기 때문 ex) 9999 + 9999 = 19998)
// 맨 뒤에서부터(1의자리수) 둘을 더해감
// 둘의 숫자를 구할 때는 인덱스가 배열에서 유효하다면 가져오고, 배열을 벗어낫다면 0
// 둘의 숫자 합을 answer값과 더한게 10을 넘어서면 앞에 한자리 올려줌
// 자리계산 후 두 배열의 인덱스 앞으로 땡김
// (이 부분에서 인덱스가 배열을 벗어나면 다음 계산부터는 0으로 적용)
// 반복하면 answer의 0번 인덱스는 값이 1 아니면 0
// 만약 값이 있다면 그대로 return, 0이라면 1번인덱스부터 끝까지만 return

// a = 11111
// b = 11111