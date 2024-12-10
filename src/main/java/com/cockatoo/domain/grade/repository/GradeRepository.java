package com.cockatoo.domain.grade.repository;

import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    boolean existsByTier(String tier);
    boolean existsByGradeId(Long gradeId);
    Optional<Grade> findByTier(String tier);
}
