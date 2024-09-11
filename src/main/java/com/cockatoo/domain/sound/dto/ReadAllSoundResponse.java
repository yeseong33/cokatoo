package com.cockatoo.domain.sound.dto;


import com.cockatoo.domain.sound.entity.Sound;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadAllSoundResponse {

    private List<SoundDTOImpl> sounds;

    @Builder
    public ReadAllSoundResponse(List<SoundDTOImpl> sounds) {
        this.sounds = sounds;
    }
}
