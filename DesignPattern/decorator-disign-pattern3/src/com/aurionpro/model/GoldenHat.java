package com.aurionpro.model;

public class GoldenHat   extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return  "golden "+super.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200+super.getPrice();
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "golden"+super.getDiscription();
	}

}
