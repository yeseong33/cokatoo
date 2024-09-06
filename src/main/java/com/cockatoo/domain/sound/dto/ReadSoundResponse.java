package com.cockatoo.domain.sound.dto;

import com.cockatoo.domain.sound.entity.Sound;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReadSoundResponse {
    private Sound sound;

}
