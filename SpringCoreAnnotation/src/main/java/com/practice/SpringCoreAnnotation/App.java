package com.practice.SpringCoreAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.practice");
		/*
		 * Student student2 = new Student(); student2.setId(11);
		 * student2.setName("Ankur"); student2.setBatch("bca");
		 * 
		 * 
		 * Address address = new Address(); address.setState("Patna");
		 * 
		 * student2.setAddress(address);
		 */
        
        
		  Object student = container.getBean("student"); 
		  Object student2 = container.getBean("student"); 
		  System.out.println(student);
		  System.out.println(student2);
		 
		/*
		 * Object person = container.getBean("person"); System.out.println(person);
		 */
        container.close();
    }
}
