package com.fis.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Car;

public class TestRunner {

	public static void main(String[] args) {
		
		// Spring container 
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		/*Car car = (Car)spring.getBean("carNewCar");
		System.out.println(car);
		/*/
		
		
		Car car = (Car)spring.getBean("carNewCar");
		//car.setCarName("Wagon-R");
		System.out.println(car);
		
		
		
		
		spring.close();
		
	}
}