package com.fis.app.client;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Electronics;

public class MainRunner {

	public static void main(String[] args) {

		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		Electronics e1 = (Electronics) spring.getBean("electronics1");
		System.out.println(e1);
		
		Electronics e2 = (Electronics) spring.getBean("electronics2");
		 
		System.out.println(e2);

	}
}