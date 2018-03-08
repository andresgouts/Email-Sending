package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.example.dominio.Correo;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	public JavaMailSender emailSender;

	@Override
	public Correo sendSimpleMessage(Correo correo) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(correo.getTo());
		message.setSubject(correo.getSubject());
		message.setText(correo.getText());
		emailSender.send(message);
		return correo;
	}

}
