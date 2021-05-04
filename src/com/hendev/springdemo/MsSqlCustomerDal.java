package com.hendev.springdemo;


public class MsSqlCustomerDal implements ICustomerDal{
	
	@Override
	public void add() {
		System.out.println("Microsoft Server DB Added");
	}
}
