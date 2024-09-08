package com.cockatoo.domain.sound.dto;

import com.cockatoo.domain.log.dto.LogDTOImpl;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadSoundResponse {

    private Long soundId;
    private String name;
    private String path;
    private String thumbnail;
    private Integer like;
    private String origin;

    private List<LogDTOImpl> logs;

    @Builder
    public ReadSoundResponse(Long soundId, String name, String path, String thumbnail, Integer like, String origin, List<LogDTOImpl> logs) {
        this.soundId = soundId;
        this.name = name;
        this.path = path;
        this.thumbnail = thumbnail;
        this.like = like;
        this.origin = origin;
        this.logs = logs;
    }
}
