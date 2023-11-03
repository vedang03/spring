package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class CricketCoach implements ICoach {

	




	@Override
	public String getTrainingPlan() {
		return "Practice in nets for 2 hours";
	}

	

}
