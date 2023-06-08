package com.calcme.cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.calcme.cliente.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

}
