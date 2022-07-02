package com.adminflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ControllerAdvice
public class AdminFlightAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminFlightAppApplication.class, args);
	}
	
	

}
