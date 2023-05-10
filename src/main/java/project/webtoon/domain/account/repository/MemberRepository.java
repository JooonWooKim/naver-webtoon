package project.webtoon.domain.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.webtoon.domain.account.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Optional<Member> findByUsername(String username);
}
