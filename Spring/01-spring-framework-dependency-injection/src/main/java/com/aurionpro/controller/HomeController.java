package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/home")
public class HomeController {
	@Value("${team.id}")
	private String id;
	@Value("${team.name}")
	private String teamName;
	@Value("${team.player}")
	private String teamPlayer;
	

	@GetMapping("/team")
	public String team() {
		return  this.id+" "+this.teamName+" "+this.teamPlayer;
	}
	@GetMapping("/greet")
	public String greet() {
		return "<h1>Greeting from home</h1>";
	}

	@GetMapping("/home")
	public String home() {
		return "<h1>welcome to Home</h1>";
	}
}
