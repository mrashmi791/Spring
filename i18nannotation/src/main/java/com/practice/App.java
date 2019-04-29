package com.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
       
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.practice");
    	
    	//Sample sample = container.getBean(Sample.class);
    	//System.out.println(sample);
    	
    	DataSource dataSource = container.getBean(DataSource.class);
    	dataSource.display();
    	
    }
}
