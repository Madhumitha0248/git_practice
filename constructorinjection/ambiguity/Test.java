package com.madhu.Ex.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/constructorinjection/ambiguity/config.xml");
		Addition add = (Addition) context.getBean("addition");
		System.out.println(add);
	}

}
