package com.aurionpro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Student;
import com.aurionpro.repository.StudentRepository;
import com.aurionpro.service.StudentService;


@RestController
@RequestMapping("app")
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public List<Student>getAllStudents(){
		return service.findAll();
	}
		
	@PostMapping("/students")
		public Student addStudent(@RequestBody Student student) {
			return service.saveStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteById(id);
	}
}
