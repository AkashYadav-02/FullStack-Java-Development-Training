package com.aurionpro.model;

public class OilChange extends CarDecorator {

	public OilChange(ICarService carService) {
		super(carService);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 300+super.getCost();
	}
	
	
	

}
