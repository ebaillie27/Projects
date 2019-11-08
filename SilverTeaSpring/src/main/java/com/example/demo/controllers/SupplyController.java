package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.supply;
import com.example.demo.repository.SupplyRepository;

@RestController
@RequestMapping("supply")
public class SupplyController {
	
	@Autowired
	SupplyRepository SupplyR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<supply> AllSupply(){
		return SupplyR.findAll();
	}

}
