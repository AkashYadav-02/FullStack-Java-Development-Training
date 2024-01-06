package com.aurionpro.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WeightLoss  implements IDiet{

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return  "  reduce suger";
	}

}
