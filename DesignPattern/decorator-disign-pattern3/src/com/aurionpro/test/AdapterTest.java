package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.RibonHat;
import com.aurionpro.model.StandardHat;


public class AdapterTest {

	public static void main(String[] args) {
		StandardHat hat =new StandardHat();
	    GoldenHat gold=new  GoldenHat( hat);
	    RibonHat pib=new RibonHat(gold);
	System.out.println( "Total cost of   hat "+pib.getPrice());
	System.out.println( "Hat Name : "+pib.getName());
	
	System.out.println( "DEscription: "+pib.getDiscription());
	
		
	  
	

	}
}
