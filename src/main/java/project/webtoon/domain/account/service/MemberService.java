package project.webtoon.domain.account.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.webtoon.domain.account.entity.Member;
import project.webtoon.domain.account.repository.MemberRepository;
import project.webtoon.global.dto.memberSignUpRequest;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;
    @Transactional
    public void signUp(memberSignUpRequest signUpDto) {
        Member member = Member.build(signUpDto);
        memberRepository.save(member);
    }
}
