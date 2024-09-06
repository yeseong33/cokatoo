package com.cockatoo.domain.sound.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.NotFoundException;

public class SoundNotFoundException extends NotFoundException {
    public SoundNotFoundException() {
        super(ErrorCode.SOUND_NOT_FOUND);
    }
}
