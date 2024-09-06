package com.cockatoo.domain.log.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLogRequest {
    private float score;
    private String recordSound;
    private String link;
}
