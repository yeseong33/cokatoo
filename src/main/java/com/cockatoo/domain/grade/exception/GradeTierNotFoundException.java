package com.cockatoo.domain.grade.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.NotFoundException;

public class GradeTierNotFoundException extends NotFoundException {
    public GradeTierNotFoundException() {
        super(ErrorCode.GRADE_NOT_FOUND);
    }
}
