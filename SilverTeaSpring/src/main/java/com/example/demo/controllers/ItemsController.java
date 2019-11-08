package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.items;
import com.example.demo.repository.ItemsRepository;

@RestController
@RequestMapping("items")
public class ItemsController {
	
	@Autowired
	ItemsRepository ItemsR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<items> AllItems(){
		return ItemsR.findAll();
	}

}
