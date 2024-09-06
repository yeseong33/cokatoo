package com.cockatoo.domain.log.repository;

import com.cockatoo.domain.log.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {

}
