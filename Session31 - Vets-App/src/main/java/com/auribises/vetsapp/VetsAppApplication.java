package com.auribises.vetsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class VetsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetsAppApplication.class, args);
	}

}
