package com.js.springemployee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.js.springemployee.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	
}
