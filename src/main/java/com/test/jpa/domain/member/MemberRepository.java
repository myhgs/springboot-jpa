package com.test.jpa.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("SELECT m " +
            "FROM Member m ")
    Stream<Member> findAllMember();

}
