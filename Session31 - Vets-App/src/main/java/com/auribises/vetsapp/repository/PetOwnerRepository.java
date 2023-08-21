package com.auribises.vetsapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auribises.vetsapp.model.PetOwner;

public interface PetOwnerRepository extends MongoRepository<PetOwner, String>{
	
	PetOwner findPetOwnerByEmail(String petOwnerEmail);
	
	PetOwner findPetOwnerByEmailAndVetEmail(String email, String vetEmail);
	
	PetOwner findPetOwnerById(String _id);
	
	List<PetOwner> findAllPetOwnerByVetEmail(String vetEmail);
	
	public long count();
}
