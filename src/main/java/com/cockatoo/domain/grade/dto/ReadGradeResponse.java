package com.cockatoo.domain.grade.dto;

import com.cockatoo.domain.log.dto.LogDTOImpl;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadGradeResponse {
    private Long gradeId;
    private String tier;
    private String path;

    private List<LogDTOImpl> logs;

    @Builder
    public ReadGradeResponse(Long gradeId, String tier, String path, List<LogDTOImpl> logs) {
        this.gradeId = gradeId;
        this.tier = tier;
        this.path = path;
        this.logs = logs;
    }
}