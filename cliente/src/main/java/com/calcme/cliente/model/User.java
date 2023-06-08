package com.calcme.cliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class User {	
	
	@Id
    private Integer id;
    
    private String name;
    
    private String telefone;

}
