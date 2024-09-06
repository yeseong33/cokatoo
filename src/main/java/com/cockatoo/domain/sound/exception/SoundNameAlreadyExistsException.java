package com.cockatoo.domain.sound.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.AlreadyExistsException;

public class SoundNameAlreadyExistsException extends AlreadyExistsException {
    public SoundNameAlreadyExistsException() {
        super(ErrorCode.SOUND_NAME_CONFLICT);
    }
}
