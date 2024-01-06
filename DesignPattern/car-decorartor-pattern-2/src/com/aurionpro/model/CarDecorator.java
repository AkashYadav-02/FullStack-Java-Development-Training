package com.aurionpro.model;

public abstract class CarDecorator implements ICarService {
	ICarService carService;

	public CarDecorator(ICarService carService) {

		this.carService = carService;
	}

	@Override
	public double getCost() {

		return this.carService.getCost();
	}
	@Override
	public String getServiceName() {
		return carService.getServiceName();
		
	}
}
