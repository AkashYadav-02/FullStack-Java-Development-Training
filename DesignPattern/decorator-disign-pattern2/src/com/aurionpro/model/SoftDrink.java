package com.aurionpro.model;

public class SoftDrink   implements Iitem{

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "Thums Up";
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public String toString() {
		return  getItemName() +","  + getItemPrice() + "]";
	}
	
	

}
