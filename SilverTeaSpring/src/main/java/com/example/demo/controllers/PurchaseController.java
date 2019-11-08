package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.purchase;
import com.example.demo.repository.PurchaseRepository;

@RestController
@RequestMapping("purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseRepository PurchaseR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<purchase> AllPurchase(){
		return PurchaseR.findAll();
	}

}
