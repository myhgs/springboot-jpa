package com.test.jpa.service.member;

import com.test.jpa.domain.member.MemberRepository;
import com.test.jpa.dto.posts.MemberRequestDto;
import com.test.jpa.dto.posts.MemberResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by kiseokhong on 2019. 3. 12..
 */

@AllArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    MemberRepository memberRepository;

    @Override
    public Long save(MemberRequestDto dto) {
        return memberRepository.save(dto.toEntity()).getNo();
    }

    @Override
    public List<MemberResponseDto> list() {
        return memberRepository.findAllMember()
                .map(MemberResponseDto::new)
                .collect(Collectors.toList());
    }
}
