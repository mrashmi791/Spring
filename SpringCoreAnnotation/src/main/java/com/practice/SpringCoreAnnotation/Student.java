package com.practice.SpringCoreAnnotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {
	
	@Value("101")
	private Integer id;
	@Value("Ankit")
	private String name;
	@Value("mca")
	private String batch;
	
	
	//@Autowired(required=true)
	@Resource
	//@Inject
	private Address address;
	

	
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
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", batch=" + batch + ", address=" + address + "]";
	}



	
	

}
