package com.test.jpa.dto.board;

import com.test.jpa.domain.board.Board;
import com.test.jpa.domain.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToOne;

/**
 * Created by kiseokhong on 2019. 4. 3..
 */
@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {

    private Long no;
    private String subject;
    private String contents;
    private Member member;

    public Board toEntity(){
        return Board.builder()
                .subject(subject)
                .contents(contents)
                .member(member)
                .build();
    }

}
