package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.ICoach;

//@RestController
public class CoachController {

	@Autowired
	@Qualifier(value = "cricketCoach")
	ICoach coach1;

	@Autowired
	@Qualifier(value = "footballCoach")
	ICoach coach2;

	@GetMapping("/test")
	public String showTraining() {
		return coach1.getTrainingPlan() ;
	}

}
