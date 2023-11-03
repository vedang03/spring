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
import com.aurionpro.entity.InstructorTechDetail;
import com.aurionpro.service.InstructorDetailsService;
import com.aurionpro.service.InstructorService;


@RestController
@RequestMapping("/app")
public class InstructorDetailController {

	@Autowired
	InstructorDetailsService detailService;
	
	@Autowired
	InstructorService service;
	
	@GetMapping("/instructorDetails")
	public ResponseEntity<List<InstructorTechDetail>> getAllInstructorDetails(){
		List<InstructorTechDetail>instructors = detailService.findAll();
		return new ResponseEntity<>(instructors,HttpStatus.OK);
	}
	
	@PostMapping("/instructorDetails")
	public ResponseEntity<InstructorTechDetail>addNewInstructor(@RequestBody InstructorTechDetail instructor){
		InstructorTechDetail instructorNew = detailService.save(instructor);
		return new ResponseEntity<>(instructorNew,HttpStatus.CREATED);
	}
	
	@PutMapping("/instructorDetails")
	public ResponseEntity<InstructorTechDetail>updateInstructor(@RequestBody InstructorTechDetail instructor){
		InstructorTechDetail instructorNew = detailService.save(instructor);
		return new ResponseEntity<>(instructorNew,HttpStatus.OK);
	}
	
	@DeleteMapping("/instructorDetails/{id}")
	public ResponseEntity<HttpStatus>deleteInstructor(@PathVariable int id){
	detailService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/instructors/{id}/instructorDetails/{detailId}")
	public ResponseEntity<HttpStatus>updateInstructorDetailsOfInstructor(@PathVariable int id , @PathVariable
			int detailId){
		service.updateInstructorDetails(id,detailId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/instructorDetails/{id}/instructor")
	  public ResponseEntity<Instructor> getInstrustor(@PathVariable int id){
	    Instructor instructor = service.getInstructor(id);
	    return new ResponseEntity<>(instructor,HttpStatus.OK);
	  }
	
	@GetMapping("/instructor")
	public ResponseEntity<InstructorPageDto>getInstructors
	(@RequestParam(defaultValue = "2")int pageSize , @RequestParam(defaultValue="0")int pageNo ,
	  @RequestParam(defaultValue="ASC")String direction , @RequestParam(defaultValue ="id")	String title	
			){
		InstructorPageDto instructorDto =  service.findAll(pageSize,pageNo,direction,title);
		return new ResponseEntity<>(instructorDto,HttpStatus.OK);
	}
	


	
}
	
	

