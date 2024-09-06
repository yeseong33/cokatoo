package com.cockatoo.domain.grade.service;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.exception.GradeNotFoundException;
import com.cockatoo.domain.grade.exception.GradeTierAlreadyExistsException;
import com.cockatoo.domain.grade.exception.GradeTierNotFoundException;
import com.cockatoo.domain.grade.repository.GradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GradeValidationService {

    private final GradeRepository gradeRepository;

    public void validateGrade(CreateGradeRequest request) {
        boolean grade = gradeRepository.existsByTier(request.getTier());
        if (grade) {
            throw new GradeTierAlreadyExistsException();
        }
    }

    public void validateGradeById(Long gradeId) {
        boolean grade = gradeRepository.existsByGradeId(gradeId);
        if (!grade) {
            throw new GradeTierNotFoundException();
        }
    }

    public void checkGradeById(Long gradeId) {
        boolean grade = gradeRepository.existsByGradeId(gradeId);
        if (grade) {
            throw new GradeNotFoundException();
        }
    }
}
