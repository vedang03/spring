package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Student;
import com.aurionpro.repository.StudentRepository;

@RestController
@RequestMapping("/apiv1")
public class StudentController {

	StudentRepository repository;

	@Autowired
	public StudentController(StudentRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/students")
	public List<Student>getAllStudents(){
		return repository.findAll();
	}
	
	
}
