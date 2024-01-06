package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.BreakCheck;
import com.aurionpro.model.CarInspection;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.WheelAlign;


public class DecoratorTest {

	public static void main(String[] args) {
		
		CarInspection car=new CarInspection();
		 
		
		
	   WheelAlign obj=new WheelAlign(car);
	   OilChange oil=new  OilChange(obj);
	   BreakCheck brk=new BreakCheck(oil);
	   System.out.println( "Total Cost :"+brk.getCost());
			   
	
	}
}
