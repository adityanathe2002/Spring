package com.qsp.studentapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.studentapp.entity.Student;
import com.qsp.studentapp.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	public Student updateStudent(Student student) {
		return repository.save(student);
	}
	public Student deleteStudentbyId(int id) {
		Student student=findById(id);
		if(student != null) {
		repository.deleteById(id);
		return student;
		}else {
			return null;
		}
	}
	public List<Student> findAll(){
		return repository.findAll();
	}
	public Student findById(int id) {
		Optional<Student> optional=repository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
}
