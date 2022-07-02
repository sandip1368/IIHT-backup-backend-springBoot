package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface IContactService {

	List<Contact> getContactsOfUser(Long userId);

}
