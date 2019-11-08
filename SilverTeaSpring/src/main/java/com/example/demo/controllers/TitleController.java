package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.title;
import com.example.demo.repository.TitleRepository;

@RestController
@RequestMapping("title")
public class TitleController {
	
	@Autowired
	TitleRepository TitleR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<title> AllTitle(){
		return TitleR.findAll();
	}
}
