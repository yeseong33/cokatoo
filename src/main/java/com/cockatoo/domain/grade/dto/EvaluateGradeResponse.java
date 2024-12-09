package com.cockatoo.domain.grade.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EvaluateGradeResponse {
    private final GradeDTOImpl grade;
}
