package com.aurionpro.model;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String Server) {
		 System.out.println(" Connected to "+ Server);
		
	}

}
