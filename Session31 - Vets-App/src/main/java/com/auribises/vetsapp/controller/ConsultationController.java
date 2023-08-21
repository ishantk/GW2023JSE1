package com.auribises.vetsapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.auribises.vetsapp.model.Consultation;
import com.auribises.vetsapp.model.Pet;
import com.auribises.vetsapp.model.Vet;
import com.auribises.vetsapp.repository.ConsultationRepository;
import com.auribises.vetsapp.repository.PetRepository;

@RestController
public class ConsultationController {

	@Autowired
	ConsultationRepository consultationRepository;
	
	@Autowired
	PetRepository petRepository;
	
    @GetMapping("/add-consultation")
    public ModelAndView addPet(@RequestParam(name = "petOwnerEmail") String petOwnerEmail,
    		@RequestParam(name = "petId") String petId,
    		HttpSession session) {
    	
    	Vet vet = (Vet)session.getAttribute("vet");
    	
    	Pet pet = petRepository.findPetById(petId);
    	
    	
    	ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("add-consultation.html");
	    modelAndView.addObject("vet", vet);
	    modelAndView.addObject("pet", pet);
	    modelAndView.addObject("petOwnerEmail", petOwnerEmail);
    	
    	return modelAndView;
    }
	
	@PostMapping("/save-consultation")
	public ModelAndView saveConsultation(
			@RequestParam(name = "issues") String issues, 
			@RequestParam(name = "weight")Integer weight, 
			@RequestParam(name = "temperature")Double temperature,
			@RequestParam(name = "medicines")String medicines, 
			@RequestParam(name = "petId")String petId,
			@RequestParam(name = "petOwnerEmail")String petOwnerEmail,
			@RequestParam(name = "vetEmail")String vetEmail,
			HttpSession session
			) {


		ModelAndView modelAndView = new ModelAndView();
		
		Pet pet = petRepository.findPetById(petId);
		
		Consultation consultation = new Consultation(null, issues, weight, temperature, medicines, petId, petOwnerEmail, vetEmail);
		consultationRepository.save(consultation);
		

		modelAndView.setViewName("success.html");
		modelAndView.addObject("message", "Consultation Added Successfully for "+pet.getName()+" belonging to Pet Owner: "+petOwnerEmail);

		return modelAndView;
	}
	
}
