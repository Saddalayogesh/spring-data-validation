package com.java.spring.springdatavalidation.controller;

import com.java.spring.springdatavalidation.dto.ProductRequestDto;
import com.java.spring.springdatavalidation.dto.ProductResponseDto;
import com.java.spring.springdatavalidation.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDto> save(
            @Valid @RequestBody ProductRequestDto dto) {

        return ResponseEntity.ok(productService.save(dto));
    }
}