package com.cockatoo.domain.grade.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.AlreadyExistsException;

public class GradeTierAlreadyExistsException extends AlreadyExistsException {
    public GradeTierAlreadyExistsException() {
        super(ErrorCode.GRADE_TIER_CONFLICT);
    }

}
