package com.practice.SpringCoreAnnotation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Person {
	
	@Value("11")
	private Integer id;
	@PostConstruct
	public void doCheck() throws Exception {
		
		if(id == null) {
			throw new Exception();
		}
	}
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
