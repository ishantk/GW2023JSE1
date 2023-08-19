package com.auribises.vetsapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.auribises.vetsapp.model.Pet;
import com.auribises.vetsapp.model.PetOwner;
import com.auribises.vetsapp.model.Vet;
import com.auribises.vetsapp.repository.PetRepository;

@RestController
public class PetController {

	@Autowired
	PetRepository petRepository;
	
    @GetMapping("/add-pet")
    public ModelAndView addPet(@RequestParam(name = "email") String email, HttpSession session) {
    	
    	Vet vet = (Vet)session.getAttribute("vet");
    	
    	ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("add-pet.html");
	    modelAndView.addObject("vet", vet);
	    modelAndView.addObject("petOwnerEmail", email);
    	
    	return modelAndView;
    }
    
	@PostMapping("/save-pet")
	public ModelAndView savePet(
			@RequestParam(name = "name") String name, 
			@RequestParam(name = "breed")String breed, 
			@RequestParam(name = "gender")String gender,
			@RequestParam(name = "petOwnerEmail")String petOwnerEmail, 
			@RequestParam(name = "vetEmail")String vetEmail,
			HttpSession session
			) {


		ModelAndView modelAndView = new ModelAndView();
		
		Vet vet = (Vet)session.getAttribute("vet");
		
		Pet pet = new Pet(null, name, breed, gender, petOwnerEmail, vetEmail);
		petRepository.save(pet);
		

		modelAndView.setViewName("success.html");
		modelAndView.addObject("message", pet.getName()+" Added Successfully for Pet Owner: "+petOwnerEmail);

		return modelAndView;
	}
	
    @GetMapping("/all-pets-of-petowner")
    public ModelAndView fetchAllPetsOfPetOwner(@RequestParam(name = "email") String email, HttpSession session) {
    	
    	Vet vet = (Vet)session.getAttribute("vet");
    	
    	List<Pet> pets = petRepository.findAllPetsByPetOwnerEmail(email);
    	
    	pets.forEach((pet)->System.out.println(pet));
    	
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("all-pets-of-petowner.html");
    	modelAndView.addObject("pets", pets);
    	modelAndView.addObject("totalPets", pets.size());
    	modelAndView.addObject("vet", vet);
    	modelAndView.addObject("petOwnerEmail", email);
    	
    	return modelAndView;
    }
	
}
