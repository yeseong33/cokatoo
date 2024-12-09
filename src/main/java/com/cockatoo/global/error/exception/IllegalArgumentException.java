package com.cockatoo.global.error.exception;

import com.cockatoo.global.error.ErrorCode;

public class IllegalArgumentException extends BusinessBaseException {
    public IllegalArgumentException(ErrorCode errorCode) {
        super(errorCode.getCode(), errorCode);
    }

    public IllegalArgumentException() {
        super(ErrorCode.INVALID_INPUT_VALUE);
    }
}
