package com.hendev.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.hendev.springdemo")
@PropertySource("classpath:values.properties")
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MsSqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
