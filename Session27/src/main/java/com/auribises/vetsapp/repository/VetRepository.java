package com.auribises.vetsapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auribises.vetsapp.model.Vet;

public interface VetRepository extends MongoRepository<Vet, String>{

	Vet findVetByEmailAndPassword(String email, String password);
	
	Vet findVetByEmail(String email);
	
	Vet findVetById(String _id);
	
	public long count();
}
