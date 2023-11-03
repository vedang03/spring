package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.entity.Tutorial;
import com.aurionpro.repository.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService{
	
	@Autowired
	private TutorialRepository repository;

	@Override
	public List<Tutorial> getAll() {
		return repository.findAll();
	}

	@Override
	public List<Tutorial> findByLevel(int level) {
		return repository.findByLevel(level);
	}


	
}
