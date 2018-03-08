package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dominio.Correo;
import com.example.service.EmailService;


@RestController
@RequestMapping("/sender")
public class EnvioCorreoController {
	
	@Autowired
	EmailService emailService;
	
	@PostMapping("/send")
	public Correo enviarCorreo(@RequestBody Correo correo) {
		return this.emailService.sendSimpleMessage(correo);
	}
	
	@GetMapping("/prueba")
	public String prueba() {
		return "it works";
	}
}
