package com.app;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.one.Product;

import sun.applet.Main;

@SpringBootApplication
public class AppStater implements CommandLineRunner{

	private Product p;
	@Autowired
	private void custmer() {
	}
	@Override
	public void run(String... args) throws Exception {

		System.out.println(p);
		System.out.println(cu);
		public static void main1(String[] args) {
		SpringApplication.run(AppStater.class, args1);
	}
	}

	

}
