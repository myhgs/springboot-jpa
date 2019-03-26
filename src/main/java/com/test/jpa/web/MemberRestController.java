package com.test.jpa.web;

import com.test.jpa.dto.posts.MemberRequestDto;
import com.test.jpa.dto.posts.PostsRequestDto;
import com.test.jpa.dto.posts.PostsResponseDto;
import com.test.jpa.service.member.MemberService;
import com.test.jpa.service.posts.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kiseokhong on 2019. 3. 12..
 */
@RestController
@AllArgsConstructor
@RequestMapping("/member")
public class MemberRestController {

    private MemberService memberService;

    @PostMapping("")
    public Long saveMember(@RequestBody MemberRequestDto dto){
        return memberService.save(dto);
    }

    @GetMapping("")
    public void listMember(){

    }
}
