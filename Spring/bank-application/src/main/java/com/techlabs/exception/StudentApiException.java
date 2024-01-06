package com.techlabs.exception;

import org.springframework.http.HttpStatus;

public class StudentApiException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public StudentApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public StudentApiException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
