package com.junit.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.junit.entity.Person;

@SpringBootTest
public class PersonRepoTest {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Test
	void isPersonExistsById() {
		Person person = new Person(123,"ram","pune");
		
		
		personRepo.save(person);
		Boolean actualResult = personRepo.isPersonExistsById(123);
		assertThat(actualResult).isTrue();
		
		
		
	}

}
