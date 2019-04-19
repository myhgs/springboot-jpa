package com.test.jpa.domain.board;

import com.test.jpa.domain.member.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by kiseokhong on 2019. 4. 3..
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity // Table
public class Board {
    @Id
    @GeneratedValue
    private Long boardNo;

    private String subject;

    private String contents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "no")
    private Member member;

    @Builder
    public Board(String subject, String contents, Member member) {
        this.subject = subject;
        this.contents = contents;
        this.member = member;
    }
}
