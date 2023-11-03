	package com.aurionpro.service;

import java.util.List;
import java.util.Optional;

import com.aurionpro.entity.Student;
import com.aurionpro.exception.StudentNotFoundException;

public interface StudentService {
	List<Student> findAll();


	Student findStudentById(int studentId) throws StudentNotFoundException;


	Student saveStudent(Student studentstudent);


	void deleteById(int id) throws StudentNotFoundException;
}
