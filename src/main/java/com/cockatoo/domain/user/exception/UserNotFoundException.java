package com.cockatoo.domain.user.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.NotFoundException;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}

