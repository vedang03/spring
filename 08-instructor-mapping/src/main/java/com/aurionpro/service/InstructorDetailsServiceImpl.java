package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.entity.Instructor;
import com.aurionpro.entity.InstructorTechDetail;
import com.aurionpro.repository.InstructorDetailRepository;
import com.aurionpro.repository.InstructorRespository;

@Service
public class InstructorDetailsServiceImpl implements InstructorDetailsService {
	
	@Autowired
	InstructorDetailRepository detailRepository;
	
	@Autowired
	InstructorRespository repository;

	@Override
	public List<InstructorTechDetail> findAll() {
		return detailRepository.findAll();
	}

	@Override
	public InstructorTechDetail save(InstructorTechDetail instructor) {
		return detailRepository.save(instructor);
	}

	@Override
	public void deleteById(int id) {
		System.out.println(id+" deleted");
        detailRepository.deleteById(id);
	}

}
