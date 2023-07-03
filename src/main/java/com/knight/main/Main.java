package com.knight.main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(user.solution2(6, arr));

//        StringBuilder sb = new StringBuilder("baabaa");
//        sb.delete(1, 3);
//        System.out.println("sb = " + sb);


    }
}


class Solution {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int max = 0;
        int result = 0;
        int count = 0;
        for (int nums : tangerine) {
            int value = map.getOrDefault(nums, 0);
            map.put(nums, value + 1);

            if (max < value + 1) {
                max = value + 1;
            }
        }
        System.out.println(map);


        while (true) {
            for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {

                if (mapEntry.getValue() >= max) {
                    result += mapEntry.getValue();
                    count++;
                    if (result >= k) {
                        return count;
                    }
                }

            }
            max--;
            count = 0;
            result = 0;

        }
    }

    public int solution2(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();

        for (int t : tangerine) {
            m.put(t, m.getOrDefault(t, 0) + 1);
        }

        System.out.println(m);

        List<Integer> list = new ArrayList<>(m.values());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        for (Integer a : list) {
            k -= a;
            answer++;
            if (k < 1) {
                return answer;
            }
        }

        return answer;
    }


    public static int solution3(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        int sum = 0;
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer x : map.keySet()) {
            list.add(map.get(x));
        }
        list.sort(Collections.reverseOrder());

        for (Integer x : list) {
            ans++;
            sum += x;
            if (sum >= k) {
                break;
            }
        }

        return ans;
    }
}




