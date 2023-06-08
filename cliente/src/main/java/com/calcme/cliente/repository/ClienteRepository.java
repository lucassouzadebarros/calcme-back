package com.calcme.cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.calcme.cliente.model.Cliente;


public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
