package com.qsp.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.studentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Student findByEmail(String email);
	public Student findByPhone(long phone);
}
