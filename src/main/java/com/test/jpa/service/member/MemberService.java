package com.test.jpa.service.member;

import com.test.jpa.domain.member.Member;
import com.test.jpa.dto.member.MemberRequestDto;
import com.test.jpa.dto.member.MemberResponseDto;

import java.util.List;

/**
 * Created by kiseokhong on 26/03/2019.
 */
public interface MemberService {

    Member save(MemberRequestDto dto);

    List<MemberResponseDto> list();


}
