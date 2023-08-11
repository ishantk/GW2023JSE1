package com.auribises.vetsapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("petowners")
public class PetOwner {
	@Id
	private String id;
	
	private String name;
	private String phone;
	private String email;
	private String gender;
	private String vetEmail; // Has-A Relationship | PetOwner Has-A Vet email id
	private Date createdOn;
	
	public PetOwner() {
		createdOn = new Date();
	}

	

	public PetOwner(String id, String name, String phone, String email, String gender, String vetEmail) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.vetEmail = vetEmail;
		this.createdOn = new Date();
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return "PetOwner [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", gender=" + gender
				+ ", vetEmail=" + vetEmail + ", createdOn=" + createdOn + "]";
	}
	
}
