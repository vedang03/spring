package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Tutorial;

public interface TutorialService {

	List<Tutorial> getAll();

	List<Tutorial> findByLevel(int level);

	
}
