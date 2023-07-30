package hello.itemservice.domain.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository { // ctrl+shift+T -> test code 생성

    private static final Map<Long, Item> store = new HashMap<>(); // 멀티쓰레스 환경에선  ConcurrentHashMap<>() 사용
    private static long sequence = 0L; // 멀티 쓰레드 환경에선 AtomicLong 사용

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
        // 한번 감싸서 반환하면 ArrayList 에 값을 추가해도 실제 store에는 변경 X
    }

    public void update(Long itemId , Item updateParam) {
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
        // 규모가 커질시 파라미터를 저장할 클래스를 설계해야함.
    }

    public void clearStore() {
        store.clear(); // test 용
    }
}
