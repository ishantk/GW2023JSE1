package com.auribises.vetsapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.auribises.vetsapp.model.Vet;
import com.auribises.vetsapp.repository.ConsultationRepository;

@RestController
public class ConsultationController {

	@Autowired
	ConsultationRepository consultationRepository;
	
	 @GetMapping("/add-consultation")
	 public ModelAndView addConsultation(HttpSession session) {
	    	
	    	Vet vet = (Vet)session.getAttribute("vet");
	    	
	    	ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("add-pet.html");
		    modelAndView.addObject("vet", vet);
	    	
	    	return modelAndView;
	  }
	
}
