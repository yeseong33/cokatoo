package com.cockatoo.domain.grade.dto;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GradeDTOImpl implements GradeDTO {
    private Long gradeId;
    private String tier;
    private String path;

    @Builder
    public GradeDTOImpl(Long gradeId, String tier, String path) {
        this.gradeId = gradeId;
        this.tier = tier;
        this.path = path;
    }
}
