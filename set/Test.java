package com.madhu.Ex.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/set/setconfig.xml");
	CarDealer cardealer = (CarDealer) context.getBean("cardealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		

	}

}
