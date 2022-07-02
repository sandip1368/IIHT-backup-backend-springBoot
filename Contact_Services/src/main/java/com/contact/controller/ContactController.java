package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.IContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private IContactService IcontSer;

	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
	return this.IcontSer.getContactsOfUser(userId);
	}
	
	
	

}
