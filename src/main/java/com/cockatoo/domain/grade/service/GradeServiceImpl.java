package com.cockatoo.domain.grade.service;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.dto.CreateGradeResponse;
import com.cockatoo.domain.grade.dto.EvaluateGradeResponse;
import com.cockatoo.domain.grade.dto.ReadGradeResponse;
import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.grade.exception.GradeIllegalArgumentException;
import com.cockatoo.domain.grade.exception.GradeNotFoundException;
import com.cockatoo.domain.grade.mapper.GradeMapper;
import com.cockatoo.domain.grade.repository.GradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService{

    private final GradeRepository gradeRepository;
    private final GradeMapper gradeMapper;
    private final GradeValidationService gradeValidationService;

    @Override
    public CreateGradeResponse createGrade(CreateGradeRequest request) {
        gradeValidationService.validateGrade(request);
        Grade grade = gradeMapper.createDTOToGrade(request);
        gradeRepository.save(grade);
        return new CreateGradeResponse(grade);
    }

    @Override
    public ReadGradeResponse readGrade(Long gradeId) {
        gradeValidationService.validateGradeById(gradeId);
        Grade grade = findGradeById(gradeId);
        ReadGradeResponse response = gradeMapper.toReadGradeResponse(grade);
        return response;
    }

    @Override
    public EvaluateGradeResponse evaluateGrade(Double score) {
        String tier = getTierByScore(score);
        Grade grade = findGradeByTier(tier);
        return gradeMapper.toEvaluateGradeResponse(grade);
    }

    private Grade findGradeById(long gradeId) {
        return gradeRepository.findById(gradeId)
                .orElseThrow(GradeNotFoundException::new);
    }

    private Grade findGradeByTier(String tier) {
        return gradeRepository.findByTier(tier)
                .orElseThrow(GradeNotFoundException::new);
    }

    private String getTierByScore(Double score) {
        if (score < 0 || score > 100) {
            throw new GradeIllegalArgumentException();
        }
        return String.valueOf(3 - Math.min((int)(score / 40), 2));
    }
}
