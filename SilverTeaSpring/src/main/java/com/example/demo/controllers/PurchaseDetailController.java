package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.purchase_detail;
import com.example.demo.repository.PurchaseDetailRepository;

@RestController
@RequestMapping("purchase_detail")
public class PurchaseDetailController {
	
	@Autowired
	PurchaseDetailRepository PurchaseDetailR;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<purchase_detail> AllPurchaseDetail(){
		return PurchaseDetailR.findAll();
	}

}
