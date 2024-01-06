package com.aurionpro.model;

public abstract class HatDecorator  implements IHat{
	
	IHat hat;
	

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return   this.hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return  this.hat.getPrice();
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return  this.hat.getDiscription();
	}

}
