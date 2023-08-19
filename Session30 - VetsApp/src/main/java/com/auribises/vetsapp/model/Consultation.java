package com.auribises.vetsapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("consultations")
public class Consultation {
	
	@Id
	private String id;
	
	private String issues;
	private Integer weight;
	private Double temperature;
	private String medicines;
	private String petId;
	private String petOwnerEmail;	// Has-A Relationship | Pet Has-A Owner email id
	private String vetEmail; 		// Has-A Relationship | Pet Has-A Vet email id
	private Date createdOn;
	
	public Consultation() {
		createdOn = new Date();
	}

	public Consultation(String id, String issues, Integer weight, Double temperature, String medicines, String petId,
			String petOwnerEmail, String vetEmail) {
		this.id = id;
		this.issues = issues;
		this.weight = weight;
		this.temperature = temperature;
		this.medicines = medicines;
		this.petId = petId;
		this.petOwnerEmail = petOwnerEmail;
		this.vetEmail = vetEmail;
		createdOn = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getPetOwnerEmail() {
		return petOwnerEmail;
	}

	public void setPetOwnerEmail(String petOwnerEmail) {
		this.petOwnerEmail = petOwnerEmail;
	}

	public String getVetEmail() {
		return vetEmail;
	}

	public void setVetEmail(String vetEmail) {
		this.vetEmail = vetEmail;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Consultation(String id, String issues, Integer weight, Double temperature, String medicines, String petId,
			String petOwnerEmail, String vetEmail, Date createdOn) {
		this.id = id;
		this.issues = issues;
		this.weight = weight;
		this.temperature = temperature;
		this.medicines = medicines;
		this.petId = petId;
		this.petOwnerEmail = petOwnerEmail;
		this.vetEmail = vetEmail;
		this.createdOn = createdOn;
	}
	
}
