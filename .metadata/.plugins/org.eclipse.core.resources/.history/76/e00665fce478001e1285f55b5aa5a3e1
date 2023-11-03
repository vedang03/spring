package com.aurionpro.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instructor_techdetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorTechDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "youtube_url")
	private String youtubeUrl;
	@Column(name = "giturl")
	private String gitUrl;
	
	@OneToOne(mappedBy = "detail")
	@JsonIgnore
	
	@Autowired
	private Instructor instruct;
	


}
