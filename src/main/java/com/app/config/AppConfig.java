package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.one.Product;

@Configuration
public class AppConfig {

	@Bean
	public Product pobj() {
	System.out.println("AppConfig loading");
	Product p=new Product();
		p.set ProductId(999);
		return p;
		
	}
}
