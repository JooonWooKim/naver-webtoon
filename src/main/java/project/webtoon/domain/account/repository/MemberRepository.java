package project.webtoon.domain.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.webtoon.domain.account.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
