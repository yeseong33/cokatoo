package com.cockatoo.domain.grade.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.NotFoundException;

public class GradeNotFoundException extends NotFoundException {
    public GradeNotFoundException() {
        super(ErrorCode.GRADE_NOT_FOUND);
    }
}
