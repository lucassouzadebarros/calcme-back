package com.calcme.cliente.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calcme.cliente.service.UserService;
import com.calcme.cliente.model.*;

@CrossOrigin("localhost:4200")
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
    private UserService userService;	
	
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Integer id) {		
		userService.delete(id);
		
	}
	
	@GetMapping
	public List<User> list(){
		 return userService.list();
	}	
	
	@PostMapping
	public  User save(@RequestBody User user){
	 return userService.save(user);
	}
	
	@GetMapping(value = "{id}")
	public User search(@PathVariable Integer id) {
		return userService.search(id);
	}

}
