package com.test.jpa.domain.member;

import com.test.jpa.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    @Builder
    public Member(String id, String password, String name, String sex, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
}
