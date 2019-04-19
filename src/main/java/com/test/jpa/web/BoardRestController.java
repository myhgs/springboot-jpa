package com.test.jpa.web;

import com.test.jpa.dto.board.BoardRequestDto;
import com.test.jpa.service.board.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kiseokhong on 2019. 3. 12..
 */
@RestController
@AllArgsConstructor
@RequestMapping("/board")
public class BoardRestController {

    private BoardService boardService;

    @PostMapping("")
    public Object saveBoard(@RequestBody BoardRequestDto dto){
        return boardService.save(dto);
    }

    @GetMapping("")
    public Object listBoard(){
        return boardService.list();
    }
}
