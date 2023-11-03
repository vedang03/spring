package com.aurionpro.repository;

import java.util.List;

import com.aurionpro.entity.Student;

public interface StudentRepository {

	List<Student> findAll();

	Student saveStudent(Student studentstudent);

	void deleteById(int id);
	
	Student findStudentById(int studentId);

	



}
