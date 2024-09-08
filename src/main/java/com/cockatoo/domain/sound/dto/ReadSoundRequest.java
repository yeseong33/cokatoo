package com.cockatoo.domain.sound.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadSoundRequest {
    private Long soundId;
}
