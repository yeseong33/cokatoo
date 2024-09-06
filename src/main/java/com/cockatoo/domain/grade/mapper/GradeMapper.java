package com.cockatoo.domain.grade.mapper;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.dto.GradeDTO;
import com.cockatoo.domain.grade.dto.GradeDTOImpl;
import com.cockatoo.domain.grade.entity.Grade;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GradeMapper {

    Grade createDTOToGrade(CreateGradeRequest request);

    GradeDTOImpl gradeDTO(Grade grade);

}
