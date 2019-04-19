package com.test.jpa.service.member;

import com.test.jpa.domain.member.Member;
import com.test.jpa.domain.member.MemberRepository;
import com.test.jpa.dto.member.MemberRequestDto;
import com.test.jpa.dto.member.MemberResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by kiseokhong on 2019. 3. 12..
 */

@AllArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    MemberRepository memberRepository;

    @Override
    public Member save(MemberRequestDto dto) {
        return memberRepository.save(dto.toEntity());
    }

    @Override
    public List<MemberResponseDto> list() {
        return memberRepository.findAll()
                .stream()
                .map(MemberResponseDto::new)
                .collect(Collectors.toList());
    }
}
