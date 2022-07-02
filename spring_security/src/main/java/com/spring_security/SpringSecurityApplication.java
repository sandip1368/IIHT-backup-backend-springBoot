package com.spring_security;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring_security.entity.User;
import com.spring_security.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityApplication {
	
	@Autowired
	private UserRepository rpository;
	
	
	@PostConstruct
	public void initUsers()
	{
		List<User> users=Stream.of(
				
				new User(1,"Admin1","Admin1","admin1@gmail.com"),
				new User(2,"Admin2","Admin2","admin2@gmail.com"),
				new User(4,"Admin3","Admin3","admin3@gmail.com"),
				new User(5,"Admin4","Admin4","admin4@gmail.com"),
				new User(6,"Admin5","Admin5","admin5@gmail.com"))
				.collect(Collectors.toList());
		
		rpository.saveAll(users);
				
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
