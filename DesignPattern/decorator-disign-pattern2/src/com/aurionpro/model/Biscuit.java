package com.aurionpro.model;

public class Biscuit   implements Iitem{

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "ParleG";
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String toString() {
		return  getItemName() + ", " + getItemPrice() + "]";
	}

	
	
}
