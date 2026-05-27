package com.java.spring.springdatavalidation.service;

import com.java.spring.springdatavalidation.dto.AuthResponseDto;
import com.java.spring.springdatavalidation.dto.LoginRequestDto;
import com.java.spring.springdatavalidation.dto.SignupRequestDto;

public interface AuthService {

    AuthResponseDto signup(SignupRequestDto dto);

    AuthResponseDto login(LoginRequestDto dto);
}