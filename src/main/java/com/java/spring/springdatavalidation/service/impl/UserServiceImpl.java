package com.java.spring.springdatavalidation.service.impl;

import com.java.spring.springdatavalidation.dto.UserResponseDto;
import com.java.spring.springdatavalidation.entity.User;
import com.java.spring.springdatavalidation.exception.UserNotFoundException;
import com.java.spring.springdatavalidation.repository.UserRepository;
import com.java.spring.springdatavalidation.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor

public class UserServiceImpl
        implements UserService {

    private final UserRepository repository;

    private final ModelMapper modelMapper;

    private final PasswordEncoder passwordEncoder;

    /*
        SAVE USER
     */

    @Override
    public UserResponseDto save(
            User user
    ) throws UserNotFoundException {

        /*
            Encode Password
         */

        user.setPassword(

                passwordEncoder.encode(
                        user.getPassword()
                )
        );

        /*
            Save User
         */

        User savedUser =
                repository.save(user);

        /*
            Entity -> DTO
         */

        return modelMapper.map(
                savedUser,
                UserResponseDto.class
        );
    }

    /*
        FIND USER BY EMAIL
     */

    @Override
    public User findByEmail(
            String email
    ) throws UserNotFoundException {

        return repository.findByEmail(email)

                .orElseThrow(() ->

                        new UserNotFoundException(
                                "User not found with email : "
                                        + email
                        )
                );
    }

    @Override
    public boolean existsByEmail(String email) {
        return repository.findByEmail(email).isPresent();
    }
}