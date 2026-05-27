package com.java.spring.springdatavalidation.controller;

import com.java.spring.springdatavalidation.dto.AuthResponseDto;
import com.java.spring.springdatavalidation.dto.LoginRequestDto;
import com.java.spring.springdatavalidation.dto.SignupRequestDto;
import com.java.spring.springdatavalidation.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponseDto> signup(
            @Valid @RequestBody SignupRequestDto dto) {

        return ResponseEntity.ok(authService.signup(dto));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(
            @Valid @RequestBody LoginRequestDto dto) {

        return ResponseEntity.ok(authService.login(dto));
    }
}