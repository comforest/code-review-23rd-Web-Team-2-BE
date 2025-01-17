package com.baro.oauth.infra.kakao.dto;

import com.baro.oauth.application.dto.OAuthTokenInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = SnakeCaseStrategy.class)
public record KakaoTokenResponse(
        String tokenType,
        String accessToken,
        String idToken,
        Integer expiresIn,
        String refreshToken,
        Integer refreshTokenExpiresIn,
        String scope
) {

    public OAuthTokenInfo toOAuthTokenInfo() {
        return new OAuthTokenInfo(accessToken, refreshToken, expiresIn);
    }
}
