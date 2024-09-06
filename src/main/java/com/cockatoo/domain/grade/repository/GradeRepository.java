package com.cockatoo.domain.grade.repository;

import com.cockatoo.domain.grade.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    boolean existsByTier(String tier);
    boolean existsByGradeId(Long gradeId);
}
