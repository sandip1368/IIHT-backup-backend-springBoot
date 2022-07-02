package com.junit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.entity.Person;
import com.junit.repository.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	
	
	public PersonService(PersonRepo repo) {
		this.personRepo=repo;
		
	}
	
public List<Person> getAllPerson(){
	
	return this.personRepo.findAll();
}
}
