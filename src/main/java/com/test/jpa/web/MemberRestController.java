package com.test.jpa.web;

import com.test.jpa.dto.member.MemberRequestDto;
import com.test.jpa.service.member.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kiseokhong on 2019. 3. 12..
 */
@RestController
@AllArgsConstructor
@RequestMapping("/member")
public class MemberRestController {

    private MemberService memberService;

    @PostMapping("")
    public Object saveMember(@RequestBody MemberRequestDto dto){
        return memberService.save(dto);
    }

    @GetMapping("")
    public Object listMember(){
        return memberService.list();
    }
}
