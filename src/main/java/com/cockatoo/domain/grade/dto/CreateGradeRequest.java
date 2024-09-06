package com.cockatoo.domain.grade.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateGradeRequest implements GradeDTO{
    private String tier;
    private String path;
}
