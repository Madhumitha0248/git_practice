package com.madhu.Ex.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Patient3{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	//init method
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method");
	}
	//destroy method
	@PreDestroy
	public void bye() {
		System.out.println("Inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
   
	
	
	
}
