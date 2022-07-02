package com.junit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.entity.Person;
import com.junit.service.PersonService;

@RestController
public class PersonController {
	
	
	@Autowired
	private PersonService iperson;
	
	
	@GetMapping("/persons")
	public  ResponseEntity<List<Person>> getAllPerson()
	{
		return ResponseEntity.ok(this.iperson.getAllPerson());
	}

}
