package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.store_location;
import com.example.demo.repository.StoreRepository;

@RestController
@RequestMapping("store_location")

public class StoreController {
	
	@Autowired
	StoreRepository StoreR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<store_location> AllStore(){
		return StoreR.findAll();
	}

}
