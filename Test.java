package com.madhu.Ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Emp emp = (Emp) ctx.getBean("emp");
		System.out.println("Employee Id: "+emp.getId());
		System.out.println("Employee name: "+emp.getName());
		

	}

}
