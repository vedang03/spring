package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Tutorial;
import com.aurionpro.service.TutorialService;
import com.aurionpro.service.TutorialServiceImpl;

@RestController
@RequestMapping("/app")
public class TutorialController {

	@Autowired
	private TutorialService service;
	
	@GetMapping("/tutorial")
	public ResponseEntity<List<Tutorial>>getTutorials(){
	List<Tutorial>tutorials = service.getAll();
	return new ResponseEntity<>(tutorials,HttpStatus.OK);
	}
	
	@GetMapping("/tutorial/level/{level}")
	public ResponseEntity<List<Tutorial>>findByLevel(@PathVariable int level){
		List<Tutorial> tutorial = service.findByLevel(level);
		return new ResponseEntity<>(tutorial,HttpStatus.OK);
	}
	
}
