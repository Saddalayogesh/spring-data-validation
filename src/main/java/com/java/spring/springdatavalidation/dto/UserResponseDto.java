package com.java.spring.springdatavalidation.dto;

import com.java.spring.springdatavalidation.enums.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {

    private Integer id;

    private String name;

    private String email;

    private Role role;
}