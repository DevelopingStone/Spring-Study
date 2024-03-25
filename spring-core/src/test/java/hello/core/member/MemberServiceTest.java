package hello.core.member;

import hello.core.member.Service.MemberService;
import hello.core.member.config.AppConfig;
import hello.core.member.config.Grade;
import hello.core.member.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {

        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member member1 = memberService.findMember(member.getId());

        //then
        Assertions.assertThat(member).isEqualTo(member1);

    }
}
