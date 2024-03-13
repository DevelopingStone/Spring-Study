package hello.core.member.config;

import hello.core.member.Repository.MemberRepository;
import hello.core.member.Repository.MemoryMemberRepository;
import hello.core.member.Service.MemberService;
import hello.core.member.Service.MemberServiceImpl;
import hello.core.member.Service.OrderService;
import hello.core.member.Service.OrderServiceImpl;
import hello.core.member.discount.DiscountPolicy;
import hello.core.member.discount.RateDiscountPolicy;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();

    }
}