package com.madhu.Ex.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	//init method
	public void hi() {
		System.out.println("Inside hi method");
	}
	//destroy method
	public void bye() {
		System.out.println("Inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Inside afterPropertiesSet method");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		
	}
	
	
}
