package com.js.springemployee.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.js.springemployee.dao.EmployeeCRUD;
import com.js.springemployee.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeCRUD crud;

	public Employee insertEmployee(Employee e) {
		e.setDoj(LocalDate.now());
		return crud.insertEmployee(e);

	}

	public List<Employee> getEmployee() {
		return crud.getEmployee();
	}

	public Employee getEmployeeById(int id) {
		return crud.getEmployeeById(id);
	}

	public String deleteEmployeeById(int id) {
		if (crud.deleteEmployeeById(id)) {
			return "DELETED";
		} else {
			return "EMPLOYEE NOT FOUND";
		}
	}

	public Employee updateEmployeeById(Employee e) {
		return crud.updateEmployeeById(e);
	}
}
