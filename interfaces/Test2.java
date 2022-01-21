package com.madhu.Ex.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/interfaces/interfacesconfig.xml");
	Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook(); //pre-shutdown method

	}

}
