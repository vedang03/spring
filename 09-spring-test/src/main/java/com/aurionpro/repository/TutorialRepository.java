package com.aurionpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial,Integer> {

	List<Tutorial> findByLevel(int level);

}
