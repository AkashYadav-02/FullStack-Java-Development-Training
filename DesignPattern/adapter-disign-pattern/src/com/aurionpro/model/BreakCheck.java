package com.aurionpro.model;

public class BreakCheck extends CarDecorator{
	
	
	
	public BreakCheck(ICarService carService) {
		super(carService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 50+super.getCost();
	}

}
