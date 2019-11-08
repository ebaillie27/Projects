package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.customer;
import com.example.demo.repository.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository CustomerR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<customer> AllCustomers(){
		return CustomerR.findAll();
	}

}
