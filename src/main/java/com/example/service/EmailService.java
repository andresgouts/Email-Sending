package com.example.service;

import org.springframework.stereotype.Repository;

import com.example.dominio.Correo;

@Repository
public interface EmailService {
	
	Correo sendSimpleMessage(Correo correo);

}
