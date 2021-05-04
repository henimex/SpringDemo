package com.hendev.springdemo;

import org.springframework.stereotype.Component;

@Component("database")
public class OracleCustomerDal implements ICustomerDal{
	
	@Override
	public void add() {
		System.out.println("Oracle DB Added");
		
	}
}
