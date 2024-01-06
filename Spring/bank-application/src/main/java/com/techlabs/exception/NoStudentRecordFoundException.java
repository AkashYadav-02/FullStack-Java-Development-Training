package com.techlabs.exception;

public class NoStudentRecordFoundException extends RuntimeException {

	public NoStudentRecordFoundException(String message) {
		super(message);
	}
}