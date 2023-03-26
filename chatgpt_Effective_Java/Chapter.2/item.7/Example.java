import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // 엔트리 객체 제거
        map.remove("key1");

        // 제거된 엔트리 객체가 참조하는 값 객체에 null 할당
        map.put("key1", null);
        System.out.println(map.size());
    }
}
