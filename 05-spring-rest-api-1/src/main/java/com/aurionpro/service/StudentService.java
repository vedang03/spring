	package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Student;

public interface StudentService {
	List<Student> findAll();


	Student findStudentById(int studentId);


	Student saveStudent(Student studentstudent);


	void deleteById(int id);
}
