package com.cockatoo.domain.grade.service;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.dto.CreateGradeResponse;
import com.cockatoo.domain.grade.dto.ReadGradeResponse;

public interface GradeService {

    CreateGradeResponse createGrade(CreateGradeRequest request);
    ReadGradeResponse readGrade(Long gradeId);
}
