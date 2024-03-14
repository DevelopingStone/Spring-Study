package hello.core.member.config;

import hello.core.member.Repository.MemberRepository;
import hello.core.member.Repository.MemoryMemberRepository;
import hello.core.member.Service.MemberService;
import hello.core.member.Service.MemberServiceImpl;
import hello.core.member.Service.OrderService;
import hello.core.member.Service.OrderServiceImpl;
import hello.core.member.discount.DiscountPolicy;
import hello.core.member.discount.RateDiscountPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}