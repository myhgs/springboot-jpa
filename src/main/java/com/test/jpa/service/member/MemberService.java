package com.test.jpa.service.member;

import com.test.jpa.dto.posts.MemberRequestDto;
import com.test.jpa.dto.posts.MemberResponseDto;

import java.util.List;

/**
 * Created by kiseokhong on 26/03/2019.
 */
public interface MemberService {

    Long save(MemberRequestDto dto);

    List<MemberResponseDto> list();


}
