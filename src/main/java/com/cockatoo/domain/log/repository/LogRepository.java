package com.cockatoo.domain.log.repository;

import com.cockatoo.domain.log.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface LogRepository extends JpaRepository<Log, Long> {
    @Query("select p from Log p")
    Stream<Log> streamAll();
}
