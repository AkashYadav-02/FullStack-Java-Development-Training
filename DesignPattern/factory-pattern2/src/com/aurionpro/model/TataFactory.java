package com.aurionpro.model;

public class TataFactory  {
	// TODO Auto-generated method stub
	 private 	TataFactory() {};
	 private  static TataFactory tata;
public  static  TataFactory getInstance() {
		 
		 if(tata==null) {
			 tata=new TataFactory();
		 }
		 
		 return  tata;
		 
	 }
	public ICars makeCar() {
	
		return  new Tata();
	}
}
