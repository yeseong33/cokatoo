package com.cockatoo.global.error.exception;

import com.cockatoo.global.error.ErrorCode;

public class AlreadyExistsException extends BusinessBaseException {
    public AlreadyExistsException(ErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode);
    }

    public AlreadyExistsException() {
        super(ErrorCode.CONFLICT);
    }
}