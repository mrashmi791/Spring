package com.practice.springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
       
       
    }
}
