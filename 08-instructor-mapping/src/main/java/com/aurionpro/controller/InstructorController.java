package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.dto.InstructorPageDto;
import com.aurionpro.entity.Instructor;
import com.aurionpro.service.InstructorService;
import com.aurionpro.service.InstructorServiceImpl;

@RestController
@RequestMapping("/app")
public class InstructorController {

	@Autowired
	private InstructorService service;
	
	@GetMapping("/instructors")
	public ResponseEntity<List<Instructor>> getAllInstructor(){
		List<Instructor>instructors = service.findAll();
		return new ResponseEntity<>(instructors,HttpStatus.OK);
	}
	
	@PostMapping("/instructors")
	public ResponseEntity<Instructor>addNewInstructor(@RequestBody Instructor instructor){
		Instructor instructorNew = service.save(instructor);
		return new ResponseEntity<>(instructorNew,HttpStatus.CREATED);
	}
	
	@PutMapping("/instructors")
	public ResponseEntity<Instructor>updateInstructor(@RequestBody Instructor instructor){
		Instructor instructorNew = service.save(instructor);
		return new ResponseEntity<>(instructorNew,HttpStatus.OK);
	}
	
	@DeleteMapping("/instructors/{id}")
    public ResponseEntity<HttpStatus>deleteInstructor(@PathVariable int id){
			service.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	
//	@GetMapping("/instructor/email/{email}")
//	public ResponseEntity<List<Instructor>>getEmail(@PathVariable String email){
//		List<Instructor> instructor = service.findByEmail(email);
//		return new ResponseEntity<>(instructor,HttpStatus.OK);	
//	}
	

	}

	

