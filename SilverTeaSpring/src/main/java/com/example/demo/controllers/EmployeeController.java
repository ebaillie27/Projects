package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository EmployeeR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<employee> AllEmployees(){
		return EmployeeR.findAll();
	}

}
