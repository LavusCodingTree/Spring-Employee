package com.js.springemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.springemployee.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}

