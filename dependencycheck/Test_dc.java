package com.madhu.Ex.dependencycheck;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_dc {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/dependencycheck/dconfig.xml");
	Prescription pre = (Prescription) context.getBean("pre");
		System.out.println(pre);
	
	}

}
