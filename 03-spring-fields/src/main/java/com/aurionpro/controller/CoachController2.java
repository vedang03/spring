package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.ICoach;

@RestController
public class CoachController2 {
	
	ICoach coach1;
	ICoach coach2;

	@Autowired
	@Qualifier(value = "cricketCoach")
	public void setCoach1(ICoach coach1) {
		this.coach1 = coach1;
	}
	
	

	@Autowired
	@Qualifier(value = "footballCoach")
	public void setCoach2(ICoach coach2) {
		this.coach2 = coach2;
	}
	

	@GetMapping("/test")
	public String showTraining() {
		return coach1.getTrainingPlan();
	}

}
