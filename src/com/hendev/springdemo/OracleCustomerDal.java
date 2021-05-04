package com.hendev.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("database")
public class OracleCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("Oracle DB Added");
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
