package com.auribises.vetsapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pets")
public class Pet {

	@Id
	private String id;
	
	private String name;
	private String breed;
	private String gender;
	private String petOwnerEmail;	// Has-A Relationship | Pet Has-A Owner email id
	private String vetEmail; 		// Has-A Relationship | Pet Has-A Vet email id
	private Date createdOn;
	
	public Pet() {
		createdOn = new Date();
	}

	public Pet(String id, String name, String breed, String gender, String petOwnerEmail, String vetEmail) {
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.gender = gender;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", breed=" + breed + ", gender=" + gender + ", petOwnerEmail="
				+ petOwnerEmail + ", vetEmail=" + vetEmail + ", createdOn=" + createdOn + "]";
	}
	
}
