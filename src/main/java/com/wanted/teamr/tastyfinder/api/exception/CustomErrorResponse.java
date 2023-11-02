package com.wanted.teamr.tastyfinder.api.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CustomErrorResponse {

    private final String code;
    private final String message;

    @Builder
    private CustomErrorResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CustomErrorResponse of(ErrorCode errorCode) {
        return CustomErrorResponse.builder()
                .code(errorCode.name())
                .message(errorCode.getMessage())
                .build();

    private final String errorCode;
    private final String message;

    public CustomErrorResponse(ErrorCodeType errorCodeType) {
        errorCode = errorCodeType.name();
        message = errorCodeType.getMessage();

    }

}
