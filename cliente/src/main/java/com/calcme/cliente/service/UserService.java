package com.calcme.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcme.cliente.model.User;
import com.calcme.cliente.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public void delete(Integer id) {
		userRepository.deleteById(id);
		
	}
	
	public List<User> list() {
		return userRepository.findAll();
	}
	
	public User search(Integer id) {
		return userRepository.findById(id).orElse(null);
		
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}

}
