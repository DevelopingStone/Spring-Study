package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.*;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest { // 다른곳에서 사용할 일이 없으므로 public 사용하지 않아도됨.

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
        /**
         * 하나의 테스트는 서로 의존관계에 있어서는 안되기 때문에
         * 테스트를 한 후에 모든 객체를 클리어 해준다.
         */

    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member(); //shift + F6 으로 member1 -> member2
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get(); // ctrl alt v 로 저장할 객체 생성
        assertThat(result).isEqualTo(member1);
    }


    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
