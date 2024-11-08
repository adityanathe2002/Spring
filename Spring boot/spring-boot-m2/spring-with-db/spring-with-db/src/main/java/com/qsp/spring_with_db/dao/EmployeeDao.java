package com.qsp.spring_with_db.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qsp.spring_with_db.entity.Employee;
import com.qsp.spring_with_db.repository.EmployeeRepository;

@Component
public class EmployeeDao {
	@Autowired
	EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return repository.save(employee);
	}

	public Employee findEmployeeById(int id) {
		Optional<Employee> optional = repository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public List<Employee> findByEmployeeName(String name){
		return repository.findByName(name);
	}
	public void deleteEmployeeById(int id) {
		repository.deleteById(id);
	}

	public List<Employee> findAllEmployee() {
		return repository.findAll();
	}
	
	
}
