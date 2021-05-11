package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; // 0,1,2,..... 이렇게 key 값을 생성해주는 녀석. 실무에선
    // 동시성 문제 등등 때문에 AtomicLong 을 사용.

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        // 값이 없으면 null이 나올텐데, Optional.ofNullable로 감싸서 처리한다.
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); // 끝까지 하나라도 찾아내는 메서드
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }


    // 위 메서드들을 테스트해봐야 할텐데.. 그게 테스트케이스 !!
}
