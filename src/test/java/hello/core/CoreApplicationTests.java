package hello.core;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import hello.core.singleton.SingletonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreApplicationTests {

    @Test
    @DisplayName("동일한 객체 생성 싱글톤 테스트")
    void contextLoads() {
        SingletonService instance1 = SingletonService.getInstance();
        SingletonService instance2 = SingletonService.getInstance();
        assertThat(instance1).isSameAs(instance2);
    }

}
