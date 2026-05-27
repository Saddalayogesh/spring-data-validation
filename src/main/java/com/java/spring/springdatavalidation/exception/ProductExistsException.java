package com.java.spring.springdatavalidation.exception;

public class ProductExistsException extends RuntimeException {
    public ProductExistsException(String message) {
        super(message);
    }
}
