package com.cockatoo.domain.log.dto;

import com.cockatoo.domain.grade.dto.GradeDTOImpl;
import com.cockatoo.domain.sound.dto.SoundDTOImpl;
import com.cockatoo.domain.user.dto.UserDTOImpl;
import jdk.jshell.execution.LoaderDelegate;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateLogResponse {
    private Long logId;
    private Float score;
    private String recordSound;
    private String link;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private UserDTOImpl user;
    private SoundDTOImpl sound;
    private GradeDTOImpl grade;

    @Builder
    public UpdateLogResponse(Long logId, float score, String recordSound, String link, LocalDateTime createdAt, LocalDateTime updatedAt, UserDTOImpl user, SoundDTOImpl sound, GradeDTOImpl grade) {
        this.logId = logId;
        this.score = score;
        this.recordSound = recordSound;
        this.link = link;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.user = user;
        this.sound = sound;
        this.grade = grade;
    }


}
