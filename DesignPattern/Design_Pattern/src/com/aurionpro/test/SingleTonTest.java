package com.aurionpro.test;

import com.aurionpro.model.Singleton;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Singleton obj1= Singleton.getInstance();
		Singleton obj2= Singleton.getInstance();
		System.out.println(obj1.hashCode()+  " "  +obj2.hashCode());
	}

}
