package com.aurionpro.model;

public class HatAdapter  implements Iitem {

	
	Hat hat;

	public Hat getHat() {
		return hat;
	}

	public void setHat(Hat hat) {
		this.hat = hat;
	}

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
	
		return this.hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return this.hat.getBasicPrice()+this.hat.getTax();
	}

	@Override
	public String toString() {
		return "HatAdapter [hat=" + hat + "]";
	}
	
	
	
}
