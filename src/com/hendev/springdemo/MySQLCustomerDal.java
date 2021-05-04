package com.hendev.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MySQLCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("MySQL DB Added");
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
