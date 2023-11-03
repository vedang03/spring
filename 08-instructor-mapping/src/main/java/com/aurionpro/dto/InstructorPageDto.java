package com.aurionpro.dto;

import java.util.List;

import com.aurionpro.entity.Instructor;

import lombok.Data;

@Data
public class InstructorPageDto {

	private List<Instructor>content;
	private int pageNumber;
	private int numberOfElements;
	private long totalElements;
	private int totalPages;
	private boolean hasNext;
	private boolean hasPrevious;
	private boolean isFirst;
	private boolean isLast;
}
