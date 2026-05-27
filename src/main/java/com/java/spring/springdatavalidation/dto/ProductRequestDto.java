package com.java.spring.springdatavalidation.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductRequestDto {

    @NotBlank(message = "Product name is required")
    private String name;

    @Min(value = 1, message = "Price must be greater than 0")
    private double price;

    @NotBlank(message = "Category is required")
    private String category;

    @NotNull(message = "Availability status is required")
    private Boolean available;
}