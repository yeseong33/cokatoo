package com.cockatoo.domain.log.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateLogRequest implements LogDTO {

    private Float score;
    private String recordSound;
    private String link;

    private Long userId;
    private Long soundId;
    private Long gradeId;
}
