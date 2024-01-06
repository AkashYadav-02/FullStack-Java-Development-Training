package com.aurionpro.model;

public class MahindraFactory   implements ICarFactory {

  private  MahindraFactory() {};
  
 
	 private  static MahindraFactory mahindra;
public  static  MahindraFactory getInstance() {
		 
		 if(mahindra==null) {
			 mahindra=new MahindraFactory();
		 }
		 
		 return  mahindra;
		 
	 }
	@Override
	public ICars makeCar() {
		// TODO Auto-generated method stub
		return  new Mahindra();
	}

	
	
}
