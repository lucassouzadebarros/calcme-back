package com.calcme.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calcme.cliente.service.ClienteService;
import com.calcme.cliente.model.*;

@CrossOrigin("localhost:4200")
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
    private ClienteService userService;
	
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable String id) {
		userService.delete(id);
		
	}
	
	@GetMapping
	public List<Cliente> list(){
		 return userService.list();
	}	
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente){

	 return userService.save(cliente);
	}
	
	@GetMapping(value = "{id}")
	public Cliente search(@PathVariable String id) {
		return userService.search(id);
	}

}
