package com.aurionpro.model;

import org.springframework.stereotype.Component;

@Component
public class WeightLossDiet implements IDiet{

	@Override
	public String getPlan() {
		return "Reduce fats and carbs";
	}

}
