package com.madhu.Ex.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/properties/propconfig.xml");
	CountriesAndLanguages contandlangs = (CountriesAndLanguages ) context.getBean("countriesandlangs");
		System.out.println(contandlangs);
		

	}

}
