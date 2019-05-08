package com.practice.jdbctemplate;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
       ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
       JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
       String query="insert into studentinfo values (?,?,?)";
       int record = jdbcTemplate.update(query,4,"Ram",6);
       System.out.println(record);
    
    }
}
