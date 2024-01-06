package com.aurionpro.model;

public class RibonHat extends HatDecorator {

	public RibonHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return  "Ribon"+super.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 150+super.getPrice();
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "Ribon "+super.getDiscription();
	}

}
