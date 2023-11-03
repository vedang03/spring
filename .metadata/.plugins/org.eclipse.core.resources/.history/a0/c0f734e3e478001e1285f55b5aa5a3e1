package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.aurionpro.dto.InstructorPageDto;
import com.aurionpro.entity.Instructor;
import com.aurionpro.entity.InstructorTechDetail;
import com.aurionpro.repository.InstructorDetailRepository;
import com.aurionpro.repository.InstructorRespository;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorRespository repository;

	@Autowired
	private InstructorDetailRepository detailsRepository;
	
	

	public InstructorServiceImpl(InstructorRespository repository, InstructorDetailRepository detailsRepository) {
		super();
		this.repository = repository;
		this.detailsRepository = detailsRepository;
	}

	@Override
	public List<Instructor> findAll() {
		return repository.findAll();
	}

	@Override
	public Instructor save(Instructor instructor) {
		return repository.save(instructor);
	}

	@Override
	public void deleteById(int id) {
		try {
			repository.deleteById(id);
		} catch (Exception e) {
			System.out.println("Delete unsuccessful");
		}
	}

	@Override
	public void updateInstructorDetails(int id, int detailId) {
		Instructor instructor = repository.findById(id).get();

		InstructorTechDetail instructorDetail = detailsRepository.findById(detailId).get();
		instructor.setDetail(instructorDetail);
		repository.save(instructor);
	}

	@Override
	public Instructor getInstructor(int id) {
		InstructorTechDetail instructorDetails = detailsRepository.findById(id).get();
		return instructorDetails.getInstruct();
	}

	@Override
	public InstructorPageDto findAll(int pageSize, int pageNo, String direction, String title) {

		Sort sort = null;

		if (direction.equalsIgnoreCase("desc")) {
			sort = Sort.by(Sort.Direction.DESC, title);
		} else {
			sort = Sort.by(Sort.Direction.ASC, title);
		}

		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<Instructor> page = repository.findAll(pageable);
		List<Instructor> instructors = page.getContent();

		InstructorPageDto instructorDto = new InstructorPageDto();

		instructorDto.setContent(instructors);
		instructorDto.setFirst(page.isFirst());
		instructorDto.setLast(page.isLast());
		instructorDto.setHasNext(page.hasNext());
		instructorDto.setHasPrevious(page.hasPrevious());
		instructorDto.setNumberOfElements(page.getNumberOfElements());
		instructorDto.setPageNumber(page.getNumber());
		instructorDto.setTotalElements(page.getTotalElements());
		instructorDto.setTotalPages(page.getTotalPages());

		return instructorDto;
	}

//	@Override
//	public List<Instructor> findByEmail(String email) {
//		List<Instructor> instructors =  repository.findByEmail(email);
//		return instructors;
//	}

}
