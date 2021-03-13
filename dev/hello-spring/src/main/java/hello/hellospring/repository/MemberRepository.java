package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
    // interface 이기 때문에 이런 기능이 있다~ 정도만 작업.. 구현체 따로 만들어야 함.
}
