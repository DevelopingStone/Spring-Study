import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Solution user = new Solution();
    System.out.println(user.solution("baaaabc"));
//    System.out.println(user.solution("abdc"));

  }

}

class Solution {

  public String solution(String s) {
    Map<String, Integer> map = new HashMap<>();
    Set<String> set = new HashSet<>();
    List<String> list = new ArrayList<>(set);
    StringBuilder sb = new StringBuilder();

    for (String str : s.split("")) {
      set.add(str);
      int num = map.getOrDefault(str, 0);
      map.put(str, num + 1);
    }

    Collections.sort(list); // 알파벳 순서대로 정렬

    for (String str : list) {
      if (map.get(str) == 1) {
        sb.append(str);
      }
    }

    return sb.toString();
  }
}

/*
공부시간 8시간이상
비선형 인강 듣기
객체지향개념 정리하기
스터디
 */




