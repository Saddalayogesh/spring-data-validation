package com.java.spring.springdatavalidation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponseDto {

    private String accessToken;

    private String refreshToken;

    private UserResponseDto user;
}