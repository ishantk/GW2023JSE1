package com.auribises.vetsapp.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.auribises.vetsapp.model.Vet;
import com.auribises.vetsapp.repository.VetRepository;

// REST: Representational State Transfer

@RestController
public class VetController {

	@Autowired
	VetRepository vetRepository;

	
    public String encryptPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : encodedHash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
	
	//@GetMapping("/save-vet")
    @PostMapping("/save-vet")
	//public LinkedHashMap<String, String> saveVet(
    public ModelAndView saveVet(
			@RequestParam(name = "name") String name, 
			@RequestParam(name = "phone")String phone, 
			@RequestParam(name = "email")String email, 
			@RequestParam(name = "password")String password
		) {
		
		//LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();
    	
    	ModelAndView modelAndView = new ModelAndView();
		
		Vet vet = new Vet(null, name, phone, email, password);
		
		try {
			vet.setPassword(encryptPassword(vet.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		// Add the Vet Document inside MongoDB
		vetRepository.save(vet);
		
		//response.put("code", "101");
		//response.put("message", "Vet "+vet.getName()+" Saved Successfully");
		
		//return response;
		
		modelAndView.setViewName("home.html");
	    modelAndView.addObject("name", vet.getName());
	    modelAndView.addObject("email", vet.getEmail());
	    modelAndView.addObject("dateTimeStamp", new Date().toString());
		
		return modelAndView;
	}
    
    
    @PostMapping("/login-vet")
    //	public LinkedHashMap<String, String> loginVet(
	public ModelAndView loginVet(
   			@RequestParam(name = "email")String email, 
   			@RequestParam(name = "password")String password
   		) {
   		
   		//LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();
   		
		ModelAndView modelAndView = new ModelAndView();

    	
   		try {
   			password = encryptPassword(password);
   		} catch (NoSuchAlgorithmException e) {
   			e.printStackTrace();
   		}
   		
   		Vet vet = vetRepository.findVetByEmailAndPassword(email, password);
   		   		
   		System.out.println(vet);
   		
   		if(vet != null) {
   			
   	    	modelAndView.setViewName("home.html");
   	    	modelAndView.addObject("name", vet.getName());
   	    	modelAndView.addObject("email", vet.getEmail());
   	    	modelAndView.addObject("dateTimeStamp", new Date().toString());
   	    
   		}else {
   			modelAndView.setViewName("/");
   		}
   		
   		return modelAndView;
   	}
       
    
    @GetMapping("/register")
    public ModelAndView register() {
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("register.html");
    	modelAndView.addObject("dateTimeStamp", new Date().toString());
    	return modelAndView;
    }
	
}
