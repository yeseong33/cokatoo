package com.cockatoo.domain.log.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.NotFoundException;

public class LogNotFoundException extends NotFoundException {
    public LogNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}

