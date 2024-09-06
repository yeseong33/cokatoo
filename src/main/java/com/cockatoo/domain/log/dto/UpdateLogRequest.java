package com.cockatoo.domain.log.dto;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateLogRequest {
    private float score;
    private String recordSound;
    private String link;

    @Builder
    public UpdateLogRequest(float score, String recordSound, String link) {
        this.score = score;
        this.recordSound = recordSound;
        this.link = link;
    }
}
