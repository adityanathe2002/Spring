package com.qsp.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.studentapp.dto.ResponseStructure;
import com.qsp.studentapp.entity.Student;
import com.qsp.studentapp.service.StudentService;

@RestController
@RequestMapping("/qsp")
public class StudentController {

	@Autowired
	private StudentService service;
	@PostMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> saveStudent(@RequestBody Student student){
		return service.saveStudent(student);
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<ResponseStructure<Student>> findStudentById(@PathVariable int id){
		return service.findById(id);
	}
	@GetMapping("/student")
	public ResponseEntity<ResponseStructure<List<Student>>> findAll(){
		return service.findALL();
	}
}
