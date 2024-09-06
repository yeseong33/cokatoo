package com.cockatoo.domain.grade.dto;

import com.cockatoo.domain.grade.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReadGradeResponse {
    private Grade grade;
}