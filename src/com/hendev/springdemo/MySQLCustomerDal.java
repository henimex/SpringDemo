package com.hendev.springdemo;

public class MySQLCustomerDal implements ICustomerDal{
	
	@Override
	public void add() {
		System.out.println("MySQL DB Added");
	}
}
