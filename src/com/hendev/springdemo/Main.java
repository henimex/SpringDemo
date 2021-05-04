package com.hendev.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("After XML File");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		//context.refresh(); //prevents context switching errors
		
		//ICustomerDal customer = context.getBean("database",ICustomerDal.class);
		
		ICustomerService customer = context.getBean("service",ICustomerService.class);
		
		customer.add();
	}
}
