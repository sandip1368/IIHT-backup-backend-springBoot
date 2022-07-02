package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements IUserService {
	
	
	
	List<User> list=List.of(
			
			new User(1L,"Aaaaa","12345678L"),
			new User(2L,"Bbbbb","12346735L"),
			new User(3L,"Ccccc","35663535L"),
			new User(4L,"Ddddd","847246476L"),
			new User(5L,"Eeeee","9817364653L"),
			new User(6L,"Fffff","8793844444L")
			);

	public User getUser(Long Id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(Id)).findAny().orElse(null);
	}

}
