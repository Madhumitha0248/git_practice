package com.madhu.Ex.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/madhu/Ex/reftypes/refconfig.xml");
	Student stu = (Student) context.getBean("student");
		System.out.println(stu);
		

	}

}
