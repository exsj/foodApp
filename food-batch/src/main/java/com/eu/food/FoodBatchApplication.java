package com.eu.food;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableBatchProcessing
public class FoodBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodBatchApplication.class, args);
	}

}
