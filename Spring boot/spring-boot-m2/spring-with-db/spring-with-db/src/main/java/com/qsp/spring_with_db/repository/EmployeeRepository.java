package com.qsp.spring_with_db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qsp.spring_with_db.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByName(String name);
	List<Employee> findBySal(double sal);
	
	@Query("select e from Employee e where e.email=?1 and e.password=?2")
	Employee findEmployeeByEmailAndPassword(String email,String password);
	
	@Query("select e from Employee e where e.sal=?1")
	List<Employee> findAllBySal(double sal);
	
	@Query("select e from Employee e where e.name=:name")
	List<Employee> findEmployeeByName(String name);
}
