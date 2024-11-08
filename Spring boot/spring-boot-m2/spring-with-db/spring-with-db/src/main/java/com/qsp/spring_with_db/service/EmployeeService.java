package com.qsp.spring_with_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.spring_with_db.dao.EmployeeDao;
import com.qsp.spring_with_db.dto.ResponseStucture;
import com.qsp.spring_with_db.entity.Employee;
@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public ResponseEntity<ResponseStucture<Employee>> saveEmploye(Employee em) {
		 Employee employee=dao.saveEmployee(em);
		 System.out.println(em.getId());
		 ResponseStucture<Employee> responseStucture=new ResponseStucture<Employee>();
		 responseStucture.setStatusCode(201);
		 responseStucture.setMessage("created");
		 responseStucture.setData(employee);
		 return new ResponseEntity<ResponseStucture<Employee>>(responseStucture,HttpStatus.CREATED);
	}
}
