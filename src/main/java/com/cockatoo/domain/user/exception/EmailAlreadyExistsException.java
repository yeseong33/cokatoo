package com.cockatoo.domain.user.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.AlreadyExistsException;

public class EmailAlreadyExistsException extends AlreadyExistsException {
    public EmailAlreadyExistsException() {
        super(ErrorCode.USER_EMAIL_CONFLICT);
    }
}