package com.cockatoo.domain.log.dto;

import com.cockatoo.domain.grade.dto.GradeDTOImpl;
import com.cockatoo.domain.sound.dto.SoundDTOImpl;
import com.cockatoo.domain.user.dto.UserDTOImpl;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LogDTOImpl {

    private Long logId;
    private Float score;
    private String recordSound;
    private String link;

    private UserDTOImpl user;
    private SoundDTOImpl sound;
    private GradeDTOImpl grade;

    @Builder
    public LogDTOImpl(Long logId, float score, String recordSound, String link, UserDTOImpl user, SoundDTOImpl sound, GradeDTOImpl grade) {
        this.logId = logId;
        this.score = score;
        this.recordSound = recordSound;
        this.link = link;
        this.user = user;
        this.sound = sound;
        this.grade = grade;
    }
}
