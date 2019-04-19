package com.test.jpa.domain.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.test.jpa.domain.BaseTimeEntity;
import com.test.jpa.domain.board.Board;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity //Table
public class Member extends BaseTimeEntity {
    @Id //PK
    @GeneratedValue //AutoIncrement
    private Long no;

    @Column(length = 100, nullable = false)
    private String id;

    @Column(nullable = false)
    private String password;

    private String name;

    private String sex;

    private String email;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "no")
    @JsonIgnore
    private List<Board> boardList;

    @Builder
    public Member(String id, String password, String name, String sex, String email, List<Board> boardList) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.boardList = boardList;
    }
}
