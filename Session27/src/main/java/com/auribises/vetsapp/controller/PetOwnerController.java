package com.auribises.vetsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.auribises.vetsapp.model.PetOwner;
import com.auribises.vetsapp.repository.PetOwnerRepository;

@RestController
public class PetOwnerController {
	
	@Autowired
	PetOwnerRepository petOwnerRepository;

	@PostMapping("/save-pet-owner")
	public ModelAndView savePetOwner(
			@RequestParam(name = "name") String name, 
			@RequestParam(name = "phone")String phone, 
			@RequestParam(name = "email")String email, 
			@RequestParam(name = "gender")String gender
			) {


		ModelAndView modelAndView = new ModelAndView();
		PetOwner owner = new PetOwner(null, name, phone, email, gender);
		petOwnerRepository.save(owner);
		

		modelAndView.setViewName("success.html");

		return modelAndView;
	}

}
