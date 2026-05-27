package com.java.spring.springdatavalidation.service.impl;

import com.java.spring.springdatavalidation.dto.ProductRequestDto;
import com.java.spring.springdatavalidation.dto.ProductResponseDto;
import com.java.spring.springdatavalidation.entity.Product;
import com.java.spring.springdatavalidation.repository.ProductRepository;
import com.java.spring.springdatavalidation.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponseDto save(ProductRequestDto request) {

        Product product = new Product();

        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setCategory(request.getCategory());

        // Boolean -> getAvailable()
        product.setAvailable(request.getAvailable());

        Product savedProduct = productRepository.save(product);

        ProductResponseDto response = new ProductResponseDto();

        response.setId(savedProduct.getId());
        response.setName(savedProduct.getName());
        response.setPrice(savedProduct.getPrice());
        response.setCategory(savedProduct.getCategory());
        response.setAvailable(savedProduct.isAvailable());

        return response;
    }

    @Override
    public List<ProductResponseDto> getAll() {

        return productRepository.findAll()
                .stream()
                .map(product -> {

                    ProductResponseDto response = new ProductResponseDto();

                    response.setId(product.getId());
                    response.setName(product.getName());
                    response.setPrice(product.getPrice());
                    response.setCategory(product.getCategory());
                    response.setAvailable(product.isAvailable());

                    return response;
                })
                .toList();
    }
}