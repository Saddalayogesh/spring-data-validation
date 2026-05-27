package com.java.spring.springdatavalidation.service.impl;

import com.java.spring.springdatavalidation.dto.AuthResponseDto;
import com.java.spring.springdatavalidation.dto.LoginRequestDto;
import com.java.spring.springdatavalidation.dto.SignupRequestDto;
import com.java.spring.springdatavalidation.dto.UserResponseDto;
import com.java.spring.springdatavalidation.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponseDto signup(SignupRequestDto dto) {

        UserResponseDto user = UserResponseDto.builder()
                .id(1)
                .name(dto.getName())
                .email(dto.getEmail())
                .role(dto.getRole())
                .build();

        return AuthResponseDto.builder()
                .accessToken("access-token")
                .refreshToken("refresh-token")
                .user(user)
                .build();
    }

    @Override
    public AuthResponseDto login(LoginRequestDto dto) {

        UserResponseDto user = UserResponseDto.builder()
                .id(1)
                .name("Yogesh")
                .email(dto.getEmail())
                .build();

        return AuthResponseDto.builder()
                .accessToken("access-token")
                .refreshToken("refresh-token")
                .user(user)
                .build();
    }
}