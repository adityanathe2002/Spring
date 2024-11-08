package com.qsp.studentapp.dao;

import com.qsp.studentapp.entity.Subject;
import com.qsp.studentapp.repository.SubjectRepository;

public class SubjectDao {

	private SubjectRepository repository;
	
	
	public Subject saveSubject(Subject subject) {
		return repository.save(subject);
	}
	
	public Subject findByName(String name) {
		return repository.findByName(name);
	}
}
