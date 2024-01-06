package com.aurionpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class TestController {
	@GetMapping("/greet")
	public String greet() {
		return "<h1>Greeting from  test</h1>";
	}

	@GetMapping("/home")
	public String home() {
		return "<h1>welcome to Test</h1>";
	}
}
