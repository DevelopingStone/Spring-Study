package hello.hellospring.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Long, String> store = new HashMap<>();

        Member member = new Member();
        store.put(2L, "이번");
        System.out.println(new ArrayList<>(store.values()));
//

//
//        System.out.println(store.entrySet());

    }
}
