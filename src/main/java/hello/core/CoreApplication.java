package hello.core;

import hello.core.member.Service.MemberService;
import hello.core.member.config.AppConfig;
import hello.core.member.config.Grade;
import hello.core.member.entity.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "강락", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("member.getId() = " + member.getName());
        System.out.println("member.getName() = " + findMember.getName());


    }

}
