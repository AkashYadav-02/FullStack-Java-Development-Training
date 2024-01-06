package com.aurionpro.employee.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerr {
	
	@ExceptionHandler	
	public ResponseEntity<ExceptionResponse> handleIdNotFound(EmployeeNotFoundException e) {
		ExceptionResponse errorResponse = new ExceptionResponse(LocalDateTime.now(), e.getMessage(), HttpStatus.BAD_REQUEST.value());
	    return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler	
	public ResponseEntity<ExceptionResponse> handleIdNotFound(InvalidUpdateException e) {
		ExceptionResponse errorResponse = new ExceptionResponse(LocalDateTime.now(), e.getMessage(), HttpStatus.BAD_REQUEST.value());
	    return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	

}
