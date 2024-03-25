package hello.core.member.Repository;


import hello.core.member.entity.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);
}
