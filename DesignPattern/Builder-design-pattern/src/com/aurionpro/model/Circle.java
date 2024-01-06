package com.aurionpro.model;

public class Circle implements IShape {

	private  String  cicle;
	
	public  Circle( String circle){
		
		this.cicle=circle;
	}
	
	
	
	
	public String getCicle() {
		return cicle;
	}




	public void setCicle(String cicle) {
		this.cicle = cicle;
	}




	@Override
	public void draw() {
		// TODO Auto-generated method stub
		  System.out.println("Drawing a circle ,color "+ cicle+" hash code " + this.hashCode());
	}

	
}
