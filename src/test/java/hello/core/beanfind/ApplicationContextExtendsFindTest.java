package hello.core.beanfind;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import hello.core.member.discount.DiscountPolicy;
import hello.core.member.discount.FixDiscountPolicy;
import hello.core.member.discount.RateDiscountPolicy;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationContextExtendsFindTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);


    @Test
    void FindTest1() {
        assertThrows(NoUniqueBeanDefinitionException.class, () -> ac.getBean(DiscountPolicy.class));
    }

    @Test
    void FindTest2() {
        Map<String, DiscountPolicy> beansOfType = ac.getBeansOfType(DiscountPolicy.class);
        assertThat(beansOfType.size()).isEqualTo(2);
    }


    @Configuration
    static class TestConfig {

        @Bean
        public DiscountPolicy fixDisCount() {
            return new FixDiscountPolicy();
        }

        @Bean
        public DiscountPolicy rateDisCount() {
            return new RateDiscountPolicy();
        }
    }
}
