package com.cockatoo.domain.grade.mapper;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.dto.EvaluateGradeResponse;
import com.cockatoo.domain.grade.dto.GradeDTOImpl;
import com.cockatoo.domain.grade.dto.ReadGradeResponse;
import com.cockatoo.domain.grade.entity.Grade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GradeMapper {

    Grade createDTOToGrade(CreateGradeRequest request);
    ReadGradeResponse toReadGradeResponse(Grade grade);
    @Mapping(source = "grade", target = "grade")
    EvaluateGradeResponse toEvaluateGradeResponse(Grade grade);
    GradeDTOImpl gradeDTO(Grade grade);

}
