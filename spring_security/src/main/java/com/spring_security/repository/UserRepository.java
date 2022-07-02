package com.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_security.entity.User;




public interface UserRepository extends JpaRepository<User,Integer> {
	User findByUserName(String username);

}
