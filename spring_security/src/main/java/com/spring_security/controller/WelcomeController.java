package com.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.entity.AuthRequest;
import com.spring_security.util.JwtUtil;

@RestController
public class WelcomeController {

	@Autowired
	private JwtUtil jwtutil;

	@Autowired
	private AuthenticationManager authenticationmanager;

	@GetMapping("/")
	public String welcome() {
		return "welcome to the spring security";
	}

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {

		try {
			authenticationmanager.authenticate(

					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())

			);
		} catch (Exception e) {
			throw new Exception("Invalid username and Password");

		}
		return jwtutil.generatorTokan(authRequest.getUserName());
	}

}
