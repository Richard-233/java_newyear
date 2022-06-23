package com.team.miniprogram.exception;

/**
 * 统一异常
 */
public class ProgramException extends RuntimeException {
    private final Integer code;
    private final String message;

    public ProgramException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ProgramException(ProgramExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
