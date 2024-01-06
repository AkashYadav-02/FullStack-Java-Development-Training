package com.aurionpro.test;

import com.aurionpro.model.CarFactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.Singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		CarFactory car= new  CarFactory();
	car.getInstance(CarType.MAHINDRA).start();
	car.getInstance(CarType.MAHINDRA).stop();
	car.getInstance(CarType.MARUTI).start();
	car.getInstance(CarType.MARUTI).stop();
	car.getInstance(CarType.TATA).start();
	car.getInstance(CarType.TATA).stop();
//		System.out.println(car.getInstance(CarType.MARUTI));
//		System.out.println(car.getInstance(CarType.TATA));
	}

}
