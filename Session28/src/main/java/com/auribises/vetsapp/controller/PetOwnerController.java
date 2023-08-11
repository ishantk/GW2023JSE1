package com.auribises.vetsapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.auribises.vetsapp.model.PetOwner;
import com.auribises.vetsapp.model.Vet;
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
			@RequestParam(name = "gender")String gender,
			//@RequestParam(name = "vetEmail")String vetEmail,
			HttpSession session
			) {


		ModelAndView modelAndView = new ModelAndView();
		
		Vet vet = (Vet)session.getAttribute("vet");
		
		//PetOwner owner = new PetOwner(null, name, phone, email, gender, vetEmail);
		PetOwner owner = new PetOwner(null, name, phone, email, gender, vet.getEmail());
		petOwnerRepository.save(owner);
		

		modelAndView.setViewName("success.html");
		modelAndView.addObject("message", owner.getName()+" Added Successfully...");

		return modelAndView;
	}
	
    @GetMapping("/pet-owners")
    public ModelAndView fetchPetOwners(HttpSession session) {
    	
    	Vet vet = (Vet)session.getAttribute("vet");
    	
    	List<PetOwner> petOwners = petOwnerRepository.findAllPetOwnerByVetEmail(vet.getEmail());
    	
    	petOwners.forEach((owner)->System.out.println(owner));
    	
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("pet-owners.html");
    	modelAndView.addObject("petOwners", petOwners);
    	modelAndView.addObject("vet", vet);
    	
    	return modelAndView;
    }
    

}
