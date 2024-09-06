package com.cockatoo.domain.grade.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GradeDTOImpl implements GradeDTO {
    private Long gradeId;
    private String tier;
    private String path;
}
