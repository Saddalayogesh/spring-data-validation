package com.java.spring.springdatavalidation.repository;

import com.java.spring.springdatavalidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}