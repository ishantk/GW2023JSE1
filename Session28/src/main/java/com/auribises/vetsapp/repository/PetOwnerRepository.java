package com.auribises.vetsapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auribises.vetsapp.model.PetOwner;

public interface PetOwnerRepository extends MongoRepository<PetOwner, String>{
	
	PetOwner findPetOwnerByEmail(String email);
	
	PetOwner findPetOwnerById(String _id);
	
	List<PetOwner> findAllPetOwnerByVetEmail(String vetEmail);
	
	public long count();
}
