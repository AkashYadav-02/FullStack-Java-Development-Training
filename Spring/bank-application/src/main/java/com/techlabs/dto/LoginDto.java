package com.techlabs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
	private String usernameOrEmail;
	private String password;

	@Override
	public String toString() {
		return "LoginDto [usernameOrEmail=" + usernameOrEmail + ", password=" + password + "]";
	}

}
