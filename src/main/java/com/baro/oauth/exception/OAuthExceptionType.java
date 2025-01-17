package com.baro.oauth.exception;

import com.baro.common.exception.RequestExceptionType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum OAuthExceptionType implements RequestExceptionType {

    NOT_SUPPORTED_OAUTH_TYPE("지원 하지 않는 OAuth 서비스 입니다.", HttpStatus.BAD_REQUEST),
    ;

    private final String errorMessage;
    private final HttpStatus httpStatus;

    @Override
    public String errorMessage() {
        return errorMessage;
    }

    @Override
    public HttpStatus httpStatus() {
        return httpStatus;
    }
}
