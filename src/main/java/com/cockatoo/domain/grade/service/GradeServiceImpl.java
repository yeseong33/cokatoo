package com.cockatoo.domain.grade.service;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.dto.CreateGradeResponse;
import com.cockatoo.domain.grade.dto.ReadGradeResponse;
import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.grade.exception.GradeNotFoundException;
import com.cockatoo.domain.grade.mapper.GradeMapper;
import com.cockatoo.domain.grade.repository.GradeRepository;
import com.cockatoo.domain.sound.mapper.SoundMapper;
import com.cockatoo.domain.sound.repository.SoundRepository;
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
        Grade grade = gradeRepository.findById(gradeId).orElseThrow(GradeNotFoundException::new);
        return new ReadGradeResponse(grade);
    }
}
