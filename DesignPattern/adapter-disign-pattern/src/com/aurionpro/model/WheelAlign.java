package com.aurionpro.model;

public class WheelAlign  extends CarDecorator{
	public WheelAlign(ICarService carService) {
		super(carService);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 100+super.getCost();
	}
}
