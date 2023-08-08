package com.auribises.vetsapp.controller;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST: Representational State Transfer

@RestController
public class VetController {

	@GetMapping("/vets")
	public LinkedHashMap<String, String> getVets(){
		
		LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();
		response.put("message", "Vets Fetched Successfully...");
		response.put("email", "john@example.com");
		
		return response; // JSON :)
		
	}
	
}
