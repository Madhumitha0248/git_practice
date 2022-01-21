package com.madhu.Ex.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/map/mapconfig.xml");
	Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		

	}

}
