package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	private Samosa samosa;
	public void eat() {
		System.out.println("Hello Spring Framwork");
		this.samosa.prize();
		
	}
	
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

}
