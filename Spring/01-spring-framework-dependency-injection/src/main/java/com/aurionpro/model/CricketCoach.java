package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component

@Scope("prototype")
public class CricketCoach implements ICoach {
//    @Autowired
//    @Qualifier(value="weightdoLoss")
	private IDiet idiet;
    
//	public CricketCoach(@Qualifier(value="dietPlane") IDiet idiet) {
//		super();
//		this.idiet = idiet;
//	}
    
    @Autowired
    @Qualifier(value="weightdoLoss")
    public void getDiet(IDiet idiet) {
    	this.idiet = idiet;
    }
    
	@Override
		public String showdetails() {
		// TODO Auto-generated method stub
		return "Trainigin in 2 hours at cricket ground   "+ this.idiet.getDiet();
	}

	
	

}
