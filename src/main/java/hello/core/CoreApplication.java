package hello.core;

import hello.core.member.Service.MemberService;
import hello.core.member.config.AppConfig;
import hello.core.member.config.Grade;
import hello.core.member.entity.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);

//        Member member = new Member(1L, "강락", Grade.VIP);
//        memberService.join(member);

//        Member findMember = memberService.findMember(1L);



    }

} 
