package com.qsp.spring_with_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.spring_with_db.dao.EmployeeDao;
import com.qsp.spring_with_db.dto.ResponseStucture;
import com.qsp.spring_with_db.entity.Employee;
import com.qsp.spring_with_db.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	@PostMapping("/emp")
	public ResponseEntity<ResponseStucture<Employee>> saveEmployee(@RequestBody Employee employee){
		return service.saveEmploye(employee);
	}
	
	
//	@Autowired
//	EmployeeDao dao;
//
//	@PostMapping("/emp")
//	public Employee saveEmployee(@RequestBody Employee employee) {
//		return dao.saveEmployee(employee);
//	}
//	
//	@PutMapping("/emp")
//	public Employee updateEmployee(@RequestBody Employee employee) {
//		return dao.updateEmployee(employee);
//	}
//	@GetMapping("/emp/{id}")
//	public Employee findEmpoyeeById(@PathVariable int id) {
//		return dao.findEmployeeById(id);
//	}
//	@DeleteMapping("/emp/{id}")
//	public String deleteById(@PathVariable int id) {
//		Employee emp=dao.findEmployeeById(id);
//		if(emp != null) {
//		dao.deleteEmployeeById(id);
//		return "deleted";
//		}else {
//			return "given id is not present";
//		}
//	}
//	@GetMapping("/emp")
//	public List<Employee>  findAll(){
//		return dao.findAllEmployee();
//	}
//	@GetMapping("/emp/name")
//	public List<Employee>  findByName(@RequestParam String name){
//		return dao.findByEmployeeName(name);
//	}
}
