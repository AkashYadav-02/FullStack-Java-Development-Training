package com.aurionpro.test;

import com.aurionpro.model.ProxyInternet;
import com.aurionpro.model.SiteAccessDeniedException;

public class ProxyTesting {
 public static void main(String[] args) {
	
	 ProxyInternet  internet=new  ProxyInternet();
	 
	  try { 
		  internet.connectTo("google.com");
		  
	  }catch (SiteAccessDeniedException e){
		  System.out.println(e.getMessage());
		  
	  }
	 
	 
	
}
}
