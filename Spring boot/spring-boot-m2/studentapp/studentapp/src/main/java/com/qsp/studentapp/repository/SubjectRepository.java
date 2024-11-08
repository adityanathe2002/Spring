package com.qsp.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.studentapp.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
	
	public Subject findByName(String name);
	
}
