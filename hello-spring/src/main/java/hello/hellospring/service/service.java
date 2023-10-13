package hello.hellospring.service;

import hello.hellospring.repository.MemberRepository;

public class service  {
    private final MemberRepository memberRepository;


    public service(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
