package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.ICoach;

@RestController
public class CoachController {

	ICoach coach1;
	ICoach coach2;

	public CoachController(@Qualifier(value="cricketCoach")ICoach coach1,@Qualifier(value="footballCoach")ICoach coach2) {
		super();
		this.coach1 = coach1;
		this.coach2=coach2;
	}

	@GetMapping("/test")
	public String showTraining() {
		return coach2.getTrainingPlan() +" "+ coach2.getDietPlan();
	}

}
