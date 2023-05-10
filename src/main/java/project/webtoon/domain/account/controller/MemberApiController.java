package project.webtoon.domain.account.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.webtoon.domain.account.service.MemberService;
import project.webtoon.global.dto.MemberAuthRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class MemberApiController {
    private final MemberService memberService;

    //회원가입
    @PostMapping("/signup")
    public ResponseEntity signUp(MemberAuthRequest signUpDto){
        memberService.signUp(signUpDto);
        return ResponseEntity.ok("회원가입성공");
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody MemberAuthRequest loginDto) {
        return ResponseEntity.ok(memberService.login(loginDto));
    }
}