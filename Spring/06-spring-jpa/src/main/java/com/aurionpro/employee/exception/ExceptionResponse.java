package com.aurionpro.employee.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private LocalDateTime timestamp;
	private String reason;
	private int status;
	
	public ExceptionResponse(LocalDateTime timestamp, String reason,int status) {
		this.timestamp = timestamp;
		this.reason = reason;
		this.status = status;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	public String getReason() {
		return reason;
	}
	public int getStatus() {
        return status;
    }
}


