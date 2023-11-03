package com.aurionpro.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.aurionpro.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	EntityManager manager;
	
	

	public StudentRepositoryImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}



	@Override
	public List<Student> findAll() {
		TypedQuery<Student> query = manager.createQuery("from student",Student.class);
		return query.getResultList();
	}

}
