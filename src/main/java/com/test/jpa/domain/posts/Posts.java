package com.test.jpa.domain.posts;

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
public class Posts extends BaseTimeEntity {
    @Id //PK
    @GeneratedValue //AutoIncrement
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
