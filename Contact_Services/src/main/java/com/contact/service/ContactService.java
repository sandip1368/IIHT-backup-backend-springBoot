package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactService implements IContactService{

	
	List<Contact> list = List.of(
			new Contact(11L,"sandeep@gmail.com","sandeep patil",1L),
			new Contact(12L,"sagar@gmail.com","sagar patil",1L),
			new Contact(13L,"patil@gmail.com","patil a",2L),
			new Contact(14L,"vaibhav@gmail.com","Vaibhav shinde",2L),
			new Contact(15L,"omkar@gmail.com","omkar bhandari",1L),
			new Contact(16L,"ram@gmail.com","ram patil",3L),
			new Contact(17L,"asham@gmail.com","asham patil",3L),
			new Contact(18L,"suhas@gmail.com","suhas patil",3L),
			new Contact(19L,"gaju@gmail.com","Gaju patil",3L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
}
