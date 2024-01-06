package com.aurionpro.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CricketCoach implements ICoach {

	@Override
	public String showdetails() {
		// TODO Auto-generated method stub
		return "Trainigin in 2 hours at cricket ground";
	}

}
