package com.app.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.swagger.entity.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Model;

@RestController
public class UserController {
	
	@ApiOperation(value = "View a list of available Employees", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	}
	)
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public List<User> getEmployees() {
		List<User> users = new ArrayList<>();
		User u = new User();
		u.setId(231231L);
		u.setName("Swagger-UI");
		users.add(u);
		return users;
	}
	
	
	@ApiOperation(value = "Search a product with an ID",response = User.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public User showProduct(@PathVariable Integer id){
		User user = new User();
		user.setId(325234L);
		user.setName("Swagger-UI");
        return user;
    }
}
