package com.aurionpro.studentapp.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class exceptionresponse {

	
		private LocalDateTime timestamp;
		private String message;
		private int status;
		
		
}





