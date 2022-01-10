package com.in28minutes.demo2.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.demo2.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	

}
