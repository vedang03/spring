package com.aurionpro.model;

import org.springframework.stereotype.Component;

@Component
public class AthleticDiet implements IDiet {

	@Override
	public String getPlan() {
		return "Add minerals and proteins";
	}

}
