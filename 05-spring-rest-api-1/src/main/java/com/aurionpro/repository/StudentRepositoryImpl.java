package com.aurionpro.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aurionpro.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	EntityManager manager;
	
	

	public StudentRepositoryImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}



	@Override
	public List<Student> findAll() {
		TypedQuery<Student> query = manager.createQuery("from Student",Student.class);
		return query.getResultList();
		
	}


	
    @Transactional
	@Override
	public Student saveStudent(Student student) {
		manager.persist(student);
		return manager.find(Student.class, student.getId());
	}


   @Transactional
	@Override
	public void deleteById(int id) {
           Student student = manager.find(Student.class, id);		
           manager.remove(student);
           System.out.println("Student deleted");
	}



@Override
public Student findStudentById(int studentId) {
	return manager.find(Student.class, studentId);
}




}
