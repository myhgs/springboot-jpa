package com.test.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AcademyRepository extends JpaRepository<Academy, Long> {

    @Query("select a from Academy a join fetch a.subjects")
    List<Academy> findAllWithTeacher();

}
