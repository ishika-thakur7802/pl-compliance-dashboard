package com.example.ishika.plcompliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableJpaRepositories(basePackages = "com.example.ishika.plcompliance.repositories.jpa") // JPA (PostgreSQL)
@EnableMongoRepositories(basePackages = "com.example.ishika.plcompliance.repositories.mongo") // MongoDB
@SpringBootApplication
public class PlcomplianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlcomplianceApplication.class, args);
	}

}
