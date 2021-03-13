package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.memoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    memoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new memoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    // 테스트에선 메소드명 한글로 해도 상관없다.
    @Test
    void 회원가입() {
        //given 이게 주어졌을 때
        Member member = new Member();
        member.setName("hello");

        //when 실행했을 때
        Long saveId = memberService.join(member);

        //then 결과가 이렇게 나와야 해~
        Member findMember = memberService.findOne(saveId).get(); // Optional 생성 : ctrl+alt+v
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());

    }

    @Test
    public void 중복회원예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        //then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}