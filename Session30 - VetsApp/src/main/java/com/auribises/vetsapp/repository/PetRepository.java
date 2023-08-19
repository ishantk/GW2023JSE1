package com.auribises.vetsapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auribises.vetsapp.model.Pet;

public interface PetRepository extends MongoRepository<Pet, String>{

	Pet findPetById(String _id);
	
	List<Pet> findAllPetsByPetOwnerEmail(String petOwnerEmail);
	
	List<Pet> findAllPetsByVetEmail(String vetEmail);
	
	public long count();
	
}
