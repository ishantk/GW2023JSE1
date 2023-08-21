package com.auribises.vetsapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auribises.vetsapp.model.Consultation;

public interface ConsultationRepository extends MongoRepository<Consultation, String>{
	
	Consultation findConsultationById(String _id);
	
	List<Consultation> findConsultationByPetId(String petId);
	
	List<Consultation> findAllConsultationByPetOwnerEmail(String petOwnerEmail);
	
	List<Consultation> findAllConsultationByVetEmail(String vetEmail);
	
	public long count();
}
