package com.cockatoo.domain.sound.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UpdateSoundRequest implements SoundDTO {
    private String name;
    private String path;
    private String thumbnail;
    private Integer like;
    private String origin;

    @Builder
    public UpdateSoundRequest(String name, String path, String thumbnail, Integer like, String origin) {
        this.name = name;
        this.path = path;
        this.thumbnail = thumbnail;
        this.like = like;
        this.origin = origin;
    }
}
