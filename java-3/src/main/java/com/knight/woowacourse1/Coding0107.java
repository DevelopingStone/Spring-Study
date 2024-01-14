package com.knight.woowacourse1;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Coding0107 {

    public static void main(String[] args) {

        String[][] friends = {{"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"}, {"shakevan", "andole"}, {"shakevan", "jun"}, {"shakevan", "mrko"}};
        String[] visitors = {"bedi", "bedi", "donut", "bedi", "shakevan"};

        System.out.println(new Solution0107().sns("mrko", friends, visitors));

    }
}


class Solution0107 {
    Map<String, Integer> result = new LinkedHashMap<>();

    public List<String> sns(String user, String[][] friends, String[] visitors) {

        friend(user, friends);
        visitors(friends, visitors);



        return result(result);
    }

    public Map<String, Integer> friend(String user, String[][] friends) {
        for (int i = 0; i < friends.length; i++) {
            if (!friends[i][1].equals(user)) {
                int value = result.getOrDefault(friends[i][1], 0);
                result.put(friends[i][1], value + 10);
            }
        }
        return result;

    }

    public Map<String, Integer> visitors(String[][] friends, String[] visitors) {

        for (int i = 0; i < visitors.length; i++) {
            boolean visitor = true;
            for (int j = 0; j < friends.length; j++) {
                if (visitors[i].equals(friends[j][0])) {
                    visitor = false;
                    break;
                }

            }
            if (visitor) {
                int value = result.getOrDefault(visitors[i], 0);
                result.put(visitors[i], value + 1);
            }
        }
        return result;
    }

    public List<String> result(Map<String, Integer> map) {
        List<String> result = new LinkedList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getKey());
        }


        return result;
    }

}
