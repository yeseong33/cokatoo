package com.cockatoo.domain.grade.exception;

import com.cockatoo.global.error.ErrorCode;
import com.cockatoo.global.error.exception.IllegalArgumentException;

public class GradeIllegalArgumentException extends IllegalArgumentException {
    public GradeIllegalArgumentException() {
        super(ErrorCode.GRADE_INVALID_INPUT_VALUE);
    }

}
