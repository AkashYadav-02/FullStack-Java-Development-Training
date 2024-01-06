package com.aurionpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aurionpro.model.DietPlane;
import com.aurionpro.model.IDiet;
import com.aurionpro.model.WeightLoss;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}
	@Bean
	public IDiet dietdoPlane() {
	return new DietPlane();
		
	}	
	@Bean
	public IDiet weightdoLoss() {
		return new WeightLoss();
		
	}

}
