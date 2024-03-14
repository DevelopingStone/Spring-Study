package hello.core.member.Service;

import hello.core.member.Repository.MemberRepository;
import hello.core.member.entity.Member;

public class MemberServiceImpl  implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {

    }

    @Override
    public Member findMember(Long memberId) {
        return null;
    }
}
