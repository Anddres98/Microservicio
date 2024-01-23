package com.motosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MotosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotosServiceApplication.class, args);
	}

}
