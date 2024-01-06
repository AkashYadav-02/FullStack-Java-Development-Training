package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Circle;
import com.aurionpro.model.CircleShapeFactory;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		     List<String> colorList=Arrays.asList(
      "blue","green","red", "blue","green","red"
		    		 );
		    
		     
		     CircleShapeFactory factory= new CircleShapeFactory();
		     colorList.stream().forEach((color)->{
		    	  Circle circle=factory.getCircle(color);
		    	  circle.draw();
		     });
		
	}

}
