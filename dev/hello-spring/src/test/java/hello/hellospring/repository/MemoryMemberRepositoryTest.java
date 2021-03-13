package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepositoryTest {

    memoryMemberRepository repository = new memoryMemberRepository();

    @AfterEach // 메서드가 실행이 끝날때마다 이걸 실행.. 콜백메서드 라고 보면 된다.
    public void afterEach() {
        repository.clearStore();
    }
    // @Test는 순서 보장이 안된다. 따라서 모든 테스트 메서드는 순서 의존성을 없애야 한다.

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();

        //Assertions.assertEquals(result, member);
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(result);
        //ㄴ assertThat 에서 member가 result랑 같으냐? 라는 뜻으로 검증한다.

    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member(); // shift+f6 : 같은 변수명 일괄 수정
        member2.setName("spring1");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        Assertions.assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring1");
        repository.save(member2);

        List<Member> result = repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(2);

    }

}
