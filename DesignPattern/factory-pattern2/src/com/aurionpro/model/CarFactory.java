package com.aurionpro.model;

public class CarFactory {
//	private CarFactory() {};
	
	public  ICars getInstance( CarType carType) {
		
		if(  carType.equals(CarType.MAHINDRA)){
			return new Mahindra();
		}
		if(  carType.equals(CarType.MARUTI)){
			return new Maruti();
		}
		if(  carType.equals(CarType.TATA)){
			return new Tata();
		}
		return null;
	}
	
	
}
