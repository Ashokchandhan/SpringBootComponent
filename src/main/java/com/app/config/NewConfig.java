package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.one.Customer;

@Configuration
public class NewConfig {
	
	@Bean
	public Customer cobj() {
		System.out.println("new config loaded");
		Customer cu=new Customer();
		cu.set CustId(888);
		return cu;
	}

}
