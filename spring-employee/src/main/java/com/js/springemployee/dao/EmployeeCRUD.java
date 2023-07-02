package com.js.springemployee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.js.springemployee.dto.Employee;
import com.js.springemployee.repository.EmployeeRepository;

@Repository
public class EmployeeCRUD {

	@Autowired
	EmployeeRepository repository;

	public Employee insertEmployee(Employee e) {
		return repository.save(e);
	}

	public List<Employee> getEmployee() {
		return repository.findAll();
	}

	public Employee getEmployeeById(int id) {
		Optional<Employee> op = repository.findById(id);
		if (op != null) {
			return op.get();
		} else {
			return null;
		}
	}
	
	public boolean deleteEmployeeById(int id) {
		Optional<Employee> op = repository.findById(id);
		Employee e = op.get();
		if(e != null) {
			repository.delete(e);
			return true;
		}else {
			return false;
		}
	}
	
	public Employee updateEmployeeById(Employee e) {
		return repository.save(e);
	}


}
