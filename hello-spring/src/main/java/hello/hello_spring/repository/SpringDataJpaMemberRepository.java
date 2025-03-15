package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //findByName은 JPQL로 select m from Member m where m.name = ? 라고 뿌려준다
    @Override
    Optional<Member> findByName(String name);
}
