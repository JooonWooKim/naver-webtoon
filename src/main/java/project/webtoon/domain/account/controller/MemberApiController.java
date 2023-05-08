package project.webtoon.domain.account.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.webtoon.domain.account.service.MemberService;
import project.webtoon.global.dto.memberSignUpRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class MemberApiController {
    private final MemberService memberService;

    //회원가입
    @PostMapping("/signup")
    public ResponseEntity signUp(memberSignUpRequest signUpDto){
        memberService.signUp(signUpDto);
        return ResponseEntity.ok("회원가입성공");
    }
}
