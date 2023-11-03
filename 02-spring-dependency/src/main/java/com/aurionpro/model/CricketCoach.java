package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {

	IDiet diet;

	public CricketCoach(@Qualifier(value="weightLossDiet")IDiet diet) {
		super();
		this.diet = diet;
	}

	@Override
	public String getTrainingPlan() {
		return "Practice in nets for 2 hours";
	}

	@Override
	public String getDietPlan() {
		return diet.getPlan();
	}

}
