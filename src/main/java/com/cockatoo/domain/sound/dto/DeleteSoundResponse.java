package com.cockatoo.domain.sound.dto;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeleteSoundResponse {
    private Long id;

    @Builder
    public DeleteSoundResponse(Long id) {
        this.id = id;
    }
}
