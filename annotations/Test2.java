package com.madhu.Ex.annotations;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/annotations/annotationsconfig.xml");
	Patient3 patient = (Patient3) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook(); //pre-shutdown method
    
	}

}
