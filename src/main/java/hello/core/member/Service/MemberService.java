package hello.core.member.Service;

import hello.core.member.entity.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
