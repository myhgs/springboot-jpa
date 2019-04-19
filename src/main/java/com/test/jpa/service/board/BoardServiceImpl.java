package com.test.jpa.service.board;

import com.test.jpa.domain.board.Board;
import com.test.jpa.domain.board.BoardRepository;
import com.test.jpa.dto.board.BoardRequestDto;
import com.test.jpa.dto.board.BoardResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by kiseokhong on 2019. 3. 12..
 */

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

    BoardRepository boardRepository;

    @Override
    public Board save(BoardRequestDto dto) {
        return boardRepository.save(dto.toEntity());
    }

    @Override
    public List<Board> list() {
        return boardRepository.findAll();
//                .stream()
//                .map(BoardResponseDto::new)
//                .collect(Collectors.toList());
    }
}
