package com.js.springemployee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.springemployee.dao.AddressCRUD;
import com.js.springemployee.dao.EmployeeCRUD;

@Service
public class AddressService {

	@Autowired
	AddressCRUD crud;

	@Autowired
	EmployeeCRUD employeeCRUD;

}
