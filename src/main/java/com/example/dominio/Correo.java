package com.example.dominio;

public class Correo {
	
	private String to;
	private String subject;
	private String text;
		
	public Correo(String to, String subject, String text) {
		this.to = to;
		this.subject = subject;
		this.text = text;
	}
	
	public Correo() {
		
	}
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
