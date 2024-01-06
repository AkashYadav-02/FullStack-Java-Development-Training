package com.aurionpro.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Primary
@Scope("prototype")
public class FootballCoach implements ICoach {

	@Override
	public String showdetails() {
		// TODO Auto-generated method stub
		return "Trainigin in 1 hours ar football stadium" ;
	}

	
	

}
