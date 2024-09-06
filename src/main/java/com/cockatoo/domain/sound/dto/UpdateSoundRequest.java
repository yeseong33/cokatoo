package com.cockatoo.domain.sound.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSoundRequest implements SoundDTO{
    private String name;
    private String path;
    private String thumbnail;
    private Integer like;
    private String origin;
}
