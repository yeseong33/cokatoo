package com.cockatoo.global.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public enum ErrorCode {
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "E1", "올바르지 않은 입력값입니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "E2", "잘못된 HTTP 메서드를 호출했습니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E3", "서버 에러가 발생했습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "E4", "존재하지 않는 엔티티입니다."),
    CONFLICT(HttpStatus.CONFLICT, "E5", "이미 존재하는 값입니다."),
    INVALID_REQUIRED_FIELD(HttpStatus.BAD_REQUEST, "E6", "필수 입력값이 누락되었습니다."),
    UNRECOGNIZED_FLILD(HttpStatus.BAD_REQUEST, "E7", "필드 값이 아닌 입력이 있습니다."),
    INVALID_FORMAT(HttpStatus.UNPROCESSABLE_ENTITY, "E7", "필드 값의 타입이 적절하지 않은 입력이 있습니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "E8", "요청 권한이 없습니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "E9", "이 자원에 대한 접근 권한이 없습니다."),


    ARTICLE_NOT_FOUND(HttpStatus.NOT_FOUND, "A1", "존재하지 않는 아티클입니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "U1", "존재하지 않는 아이디입니다."),
    USER_NAME_CONFLICT(HttpStatus.CONFLICT, "U2", "이미 존재하는 사용자 이름입니다."),
    USER_EMAIL_CONFLICT(HttpStatus.CONFLICT, "U3", "이미 존재하는 사용자 이메일입니다."),

    SOUND_NAME_CONFLICT(HttpStatus.CONFLICT, "S1", "이미 존재하는 음원 이름입니다."),
    SOUND_NOT_FOUND(HttpStatus.NOT_FOUND, "S2", "존재하지 않는 음원입니다."),

    GRADE_NOT_FOUND(HttpStatus.NOT_FOUND, "G1", "존재하지 않는 등급입니다."),
    GRADE_TIER_CONFLICT(HttpStatus.CONFLICT, "G2", "이미 존재하는 등급입니다."),

    LOG_NOT_FOUND(HttpStatus.NOT_FOUND, "L1", "존재하지 않는 기록입니다.");



    ;

    private final String message;

    private final String code;
    private final HttpStatus status;

    ErrorCode(final HttpStatus status, final String code, final String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}