// 선형 자료구조 - 해시 테이블

import java.util.HashMap;

public class Main {
  // 해시 함수


  public static void main(String[] args) {

    HashMap<Integer, String> hs1 = new HashMap<>();
    HashMap<String, Integer> hs2 = new HashMap<>();

    hs1.put(7, "김개동");
    hs1.put(1, "김개동");
    hs1.put(2, "아무개");
    hs1.put(3, "홍길동");
    hs1.put(4, "김개동");
    hs1.put(5, "김개동");
    hs1.put(6, "김개동");

    System.out.println(hs1.containsValue("홍길동"));
    System.out.println(hs1);

    hs2.put("김개동", 1);
    hs2.put("아무개", 2);
    hs2.put("홍길동", 3);
    hs2.put("김개동", 4);

    System.out.println(hs2);

    // 기본 해시 테이블 사용 방법

    // 해시 충돌 케이스 (해시 함수 사용)

  }
}
