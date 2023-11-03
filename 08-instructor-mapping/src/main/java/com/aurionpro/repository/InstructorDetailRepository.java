package com.aurionpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Instructor;
import com.aurionpro.entity.InstructorTechDetail;

public interface InstructorDetailRepository extends JpaRepository<InstructorTechDetail, Integer> {

	List<Instructor> findByEmail(String email);
}
