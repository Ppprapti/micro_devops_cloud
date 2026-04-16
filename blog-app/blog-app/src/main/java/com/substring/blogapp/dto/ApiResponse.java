package com.substring.blogapp.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public record ApiResponse(
        String message,
        int statusCode,
        String status
) {

    public static ApiResponse create(String message, int statusCode, String status) {
        return new ApiResponse(message, statusCode, status);
    }
}
