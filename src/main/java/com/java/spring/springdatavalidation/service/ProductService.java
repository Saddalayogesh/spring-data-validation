package com.java.spring.springdatavalidation.service;

import com.java.spring.springdatavalidation.dto.ProductRequestDto;
import com.java.spring.springdatavalidation.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

    ProductResponseDto save(ProductRequestDto request);

    List<ProductResponseDto> getAll();
}