package com.test.jpa.dto.posts;

import com.test.jpa.domain.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
@Getter
@Setter
@NoArgsConstructor
public class MemberRequestDto {

    private Long no;
    private String id;
    private String password;
    private String name;
    private String sex;
    private String email;


    public Member toEntity(){
        return Member.builder()
                .id(id)
                .password(password)
                .name(name)
                .email(email)
                .sex(sex)
                .build();
    }

}
