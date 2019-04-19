package com.test.jpa.dto.board;

import com.test.jpa.domain.board.Board;
import com.test.jpa.domain.member.Member;
import lombok.Getter;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
@Getter
public class BoardResponseDto {

    private Long boardNo;
    private String subject;
    private String contents;
    private Member member;

    public BoardResponseDto(Board entity) {
        boardNo = entity.getBoardNo();
        subject = entity.getSubject();
        contents = entity.getContents();
        member = entity.getMember();
    }

}
