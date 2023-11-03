package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements ICoach{
	
	IDiet diet;
	
	

	public FootballCoach(@Qualifier(value="athleticDiet")IDiet diet) {
		super();
		this.diet = diet;
	}

	@Override
	public String getTrainingPlan() {
		return "Run for 2 hours";
	}



}
