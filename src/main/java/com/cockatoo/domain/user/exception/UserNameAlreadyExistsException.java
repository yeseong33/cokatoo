package com.cockatoo.domain.user.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.AlreadyExistsException;

public class UserNameAlreadyExistsException extends AlreadyExistsException {
    public UserNameAlreadyExistsException() {
        super(ErrorCode.USER_NAME_CONFLICT);
    }
}