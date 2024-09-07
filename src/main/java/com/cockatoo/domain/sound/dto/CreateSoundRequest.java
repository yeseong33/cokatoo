package com.cockatoo.domain.sound.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateSoundRequest implements SoundDTO {
    private String name;
    private String path;
    private String thumbnail;
    private Integer like;
    private String origin;

    public CreateSoundRequest(String name, String path, String thumbnail, Integer like, String origin) {
        this.name = name;
        this.path = path;
        this.thumbnail = thumbnail;
        this.like = like;
        this.origin = origin;
    }
}
