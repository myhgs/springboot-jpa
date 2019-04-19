package com.test.jpa.service.board;

import com.test.jpa.domain.board.Board;
import com.test.jpa.dto.board.BoardRequestDto;
import com.test.jpa.dto.board.BoardResponseDto;

import java.util.List;

/**
 * Created by kiseokhong on 2019. 4. 3..
 */
public interface BoardService {

    Board save(BoardRequestDto dto);

    List<Board> list();

}
