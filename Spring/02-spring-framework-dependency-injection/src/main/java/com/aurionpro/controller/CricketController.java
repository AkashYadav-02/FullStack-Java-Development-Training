package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.ICoach;
@RestController
@RequestMapping("/coach")
public class CricketController {
 
	private ICoach icoach1;
	private ICoach icoach2;

	public CricketController(@Qualifier(value="cricketCoach")  ICoach icoach1,
			@Qualifier(value="footballCoach")  ICoach icoach2) {
		super();
		this.icoach1 = icoach1;
		this.icoach2= icoach2;
	}
	@GetMapping("/show")
	public String show() {
		   return  this.icoach1.showdetails();
	}
	
}
