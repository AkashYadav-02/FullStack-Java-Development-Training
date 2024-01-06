package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CircleShapeFactory {

	private Map<String, Circle> circleShape;

	public CircleShapeFactory() {
		
		this.circleShape=new HashMap<String,Circle>();
		
	}

	public Circle getCircle(String color) {
		Set<String> keySet = circleShape.keySet();
          if(keySet.contains(color)) {
        	  return circleShape.get(color);
          }
          
          this.circleShape.put(color,new Circle(color));
          
           return this.circleShape.get(color);
          
          
         
	}
}
