package com.aurionpro.studentapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class exceptionhandler {

    @ExceptionHandler
    public ResponseEntity<exceptionresponse> handleIdNotFound(StudentNotFoundException e) {
        exceptionresponse errorResponse = new exceptionresponse(LocalDateTime.now(), e.getMessage(), HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler
    public ResponseEntity<exceptionresponse> handleIdNotFound(invalidupdateInvalidUpdateException e) {
        exceptionresponse errorResponse = new exceptionresponse(LocalDateTime.now(), e.getMessage(), HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
