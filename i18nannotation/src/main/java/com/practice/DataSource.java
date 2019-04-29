package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan
@PropertySource(value="db.properties")

public class DataSource {
	@Autowired
	private Environment environment;
		
	public void display() {
		System.out.println(environment.getProperty("db.userName"));
		System.out.println(environment.getProperty("db.password"));
		System.out.println(environment.getProperty("userName"));
	}

}
