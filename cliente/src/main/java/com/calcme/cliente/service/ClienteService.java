package com.calcme.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcme.cliente.model.Cliente;
import com.calcme.cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository userRepository;
	
	
	public void delete(String id) {
		userRepository.deleteById(id);

	}

	public List<Cliente> list() {
		return userRepository.findAll();
	}

	public Cliente search(String id) {
		return userRepository.findById(id).orElse(null);

	}
	
	public Cliente save(Cliente cliente) {
		return userRepository.save(cliente);
	}

}
