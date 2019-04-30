package com.practice.springlifecycle;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanNameAware, InitializingBean,BeanClassLoaderAware {

	private String id;
	private String name;
	private String beanName;
		
	
	
	
	public Person() {
		super();
		System.out.println("Constructor called...");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
		System.out.println("setId called...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setName called...");
	}
	
	  public void init() {
		  System.out.println("init method called...");
	  }


	public void setBeanName(String beanName) {
		System.out.println("setBeanName() called..."+beanName);
		
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() called...");
		
	}


	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("setBeanClassLoader() method called..."+classLoader);
		
	}
	
}
