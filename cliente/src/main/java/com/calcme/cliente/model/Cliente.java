package com.calcme.cliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Cliente {
	
	@Id
    private String id;
    
    private String nome;
    
    private String telefone;

    private String email;

}
