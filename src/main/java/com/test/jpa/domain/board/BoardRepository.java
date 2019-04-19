package com.test.jpa.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
public interface BoardRepository extends JpaRepository<Board, Long> {

}
