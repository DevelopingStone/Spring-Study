package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
@Controller
public class MemberController {



/*
    @Autowired private final MemberService memberService; 필드 주입

    @Autowired // setter 주입. public 하게 노출된다.
    public void MemberController(MemberService memberService) { // 생성자 주입
        this.memberService = memberService;
    }
 */

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) { // 생성자 주입 , 권장타입
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String creatForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/"; // 끝나면 홈 화면으로
    }

    @GetMapping("/members")
    public String list(Model model) { // ctrl+E 최근에 본 파일
        List<Member> members = memberService.findMembers();
        model.addAttribute("members" , members);
        return "/members/memberList";
    }
}
