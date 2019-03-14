package com.test.jpa.service.posts;

import com.test.jpa.dto.posts.PostsRequestDto;
import com.test.jpa.dto.posts.PostsResponseDto;

import java.util.List;

/**
 * Created by kiseokhong on 2019. 3. 12..
 */
public interface PostsService {

    Long save(PostsRequestDto dto);

    List<PostsResponseDto> findAllDesc();

}
