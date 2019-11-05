package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.users;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository UserR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<users> AllUsers(){
		return UserR.findAll();
	}
	
}
