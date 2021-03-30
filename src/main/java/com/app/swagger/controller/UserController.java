package com.app.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.swagger.entity.User;

@RestController
public class UserController {
	
	
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public List<User> getEmployees() {
		List<User> users = new ArrayList<>();
		User u = new User();
		u.setId(231231L);
		u.setName("Swagger-UI");
		users.add(u);
		return users;
		
	}
}
