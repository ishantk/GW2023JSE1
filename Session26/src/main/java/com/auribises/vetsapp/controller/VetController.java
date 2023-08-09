package com.auribises.vetsapp.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	public LinkedHashMap<String, String> saveVet(
			@RequestParam(name = "name") String name, 
			@RequestParam(name = "phone")String phone, 
			@RequestParam(name = "email")String email, 
			@RequestParam(name = "password")String password
		) {
		
		LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();
		
		Vet vet = new Vet(null, name, phone, email, password);
		
		try {
			vet.setPassword(encryptPassword(vet.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		// Add the Vet Document inside MongoDB
		vetRepository.save(vet);
		
		response.put("code", "101");
		response.put("message", "Vet "+vet.getName()+" Saved Successfully");
		
		return response;
	}
	
}
