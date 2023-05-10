package project.webtoon.domain.account.entity;

import lombok.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import project.webtoon.global.dto.memberSignUpRequest;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String username;
    private String password;
    private int cookieCount;

    public static Member build(memberAuthRequest signUpDto){
        Member member = Member.builder()
                .username(signUpDto.getUsername())
                .password(signUpDto.getPassword())
                .build();
        return member;
    }
}
