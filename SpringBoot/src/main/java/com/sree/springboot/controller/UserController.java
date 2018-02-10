package com.sree.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.springboot.domain.User;
import com.sree.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/users")
	public ResponseEntity<User> createCustomer(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
