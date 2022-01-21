package com.madhu.Ex.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/lifecycle/lcconfig.xml");
	Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook(); //pre-shutdown method

	}

}


