package com.madhu.Ex.lifecycle;

public class Patient {
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
	
	
}
