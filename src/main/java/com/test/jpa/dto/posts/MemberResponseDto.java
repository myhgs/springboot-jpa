package com.test.jpa.dto.posts;

import com.test.jpa.common.DateUtils;
import com.test.jpa.domain.member.Member;
import com.test.jpa.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
@Getter
public class MemberResponseDto {
    private Long no;
    private String id;
    private String password;
    private String name;
    private String sex;
    private String email;
    private String modifiedDate;

    public MemberResponseDto(Member entity) {
        no = entity.getNo();
        id = entity.getId();
        password = entity.getPassword();
        name = entity.getName();
        sex = entity.getSex();
        email = entity.getEmail();
        modifiedDate = DateUtils.toStringDateTime(entity.getModifiedDate());
    }

}
