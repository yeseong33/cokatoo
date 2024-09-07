package com.cockatoo.domain.sound.dto;

import com.cockatoo.domain.sound.entity.Sound;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateSoundResponse {
    private Long soundId;
    private String name;
    private String path;
    private String thumbnail;
    private Integer like;
    private String origin;


    @Builder
    public UpdateSoundResponse(Long soundId, String name, String path, String thumbnail, Integer like, String origin) {
        this.soundId = soundId;
        this.name = name;
        this.path = path;
        this.thumbnail = thumbnail;
        this.like = like;
        this.origin = origin;
    }
}
