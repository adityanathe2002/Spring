package com.qsp.studentapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.qsp.studentapp.dao.SubjectDao;
import com.qsp.studentapp.dto.ResponseStructure;
import com.qsp.studentapp.entity.Student;
import com.qsp.studentapp.entity.Subject;
import com.qsp.studentapp.exception.StudentNullValueException;

public class SubjectService {

	private SubjectDao dao;
	

	public ResponseEntity<ResponseStructure<Subject>> saveStudent(Subject subject){
		try {
		Subject returnedSubject=dao.saveSubject(subject);
		ResponseStructure<Subject> structure=new ResponseStructure<Subject>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("created");
		structure.setData(returnedSubject);
		return new ResponseEntity<ResponseStructure<Subject>>(structure,HttpStatus.CREATED);
		}catch (Exception e) {
			throw new StudentNullValueException();
			
		}
	}
	
	
}
