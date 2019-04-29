package com.practice.i18nexample;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("resource")
	public static void main( String[] args )  {
       
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
    	//ResourceBundleMessageSource messageSource = container.getBean(ResourceBundleMessageSource.class);
    	//String message = messageSource.getMessage("msg", null, null);
    	
    	
    	
   	String message = container.getMessage("msg", null, null);
    	System.out.println(message);
    }
}
