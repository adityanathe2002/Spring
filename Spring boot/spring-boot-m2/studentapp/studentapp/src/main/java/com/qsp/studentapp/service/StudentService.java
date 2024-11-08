package com.qsp.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.studentapp.dao.StudentDao;
import com.qsp.studentapp.dto.ResponseStructure;
import com.qsp.studentapp.entity.Student;
import com.qsp.studentapp.exception.StudentNullValueException;
@Service
public class StudentService {
	@Autowired
	private StudentDao dao;
	
	public ResponseEntity<ResponseStructure<Student>> saveStudent(Student student){
		try {
		Student returnedStudent=dao.saveStudent(student);
		ResponseStructure<Student> structure=new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("created");
		structure.setData(returnedStudent);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.CREATED);
		}catch (Exception e) {
			throw new StudentNullValueException();
			
		}
	}
	
	public ResponseEntity<ResponseStructure<Student>>  findById(int id){
		Student student=dao.findById(id);
		ResponseStructure<Student> structure=new ResponseStructure<Student>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found");
		structure.setData(student);
		return new ResponseEntity<ResponseStructure<Student>>(structure,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<List<Student>>>  findALL(){	
		List<Student> list=dao.findAll();
		ResponseStructure<List<Student>> structure=new ResponseStructure<List<Student>>();
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setMessage("Found");
		structure.setData(list);
		return new ResponseEntity<>(structure,HttpStatus.FOUND);
	}
	
}
