package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@Autowired
	CarMapper carMapper;
	
	@GetMapping("/cars")
	public List<Cars>cars(){
		List<Cars>carList = carMapper.findAll();  
		return carList;
	}

}
