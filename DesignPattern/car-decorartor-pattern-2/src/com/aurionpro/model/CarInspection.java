package com.aurionpro.model;

public class CarInspection implements ICarService {

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1000;
	}
	@Override
	public String  getServiceName() {
		// TODO Auto-generated method stub
		ServiceType st= ServiceType.INSPECTION;
		return  st.getServiceType(); 
	}
	

}
