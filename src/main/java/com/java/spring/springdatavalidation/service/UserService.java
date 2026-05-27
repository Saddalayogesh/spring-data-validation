package com.java.spring.springdatavalidation.service;

import com.java.spring.springdatavalidation.dto.UserResponseDto;
import com.java.spring.springdatavalidation.entity.User;
import com.java.spring.springdatavalidation.exception.UserNotFoundException;

public interface UserService {
    UserResponseDto save(User user) throws UserNotFoundException;
    User findByEmail(String email) throws UserNotFoundException;
    boolean existsByEmail(String email);
}