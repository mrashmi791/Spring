package com.practice.springlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

public class Person implements BeanNameAware, InitializingBean,BeanClassLoaderAware,EnvironmentAware ,
								BeanFactoryAware,EmbeddedValueResolverAware,ResourceLoaderAware,ApplicationEventPublisherAware,
								MessageSourceAware,ApplicationContextAware{

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


	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment..."+env);
		System.out.println(env.getProperty("os"));
		
	}


	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory()...."+beanFactory);
		
	}


	public void setEmbeddedValueResolver(StringValueResolver resolver) {

		System.out.println("setEmbeddedValueResolver()....."+resolver);
		
	}


	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("setResourceLoader()......"+resourceLoader);
		
	}


	public void setApplicationEventPublisher(ApplicationEventPublisher app) {
		System.out.println("setApplicationEventPublisher()....."+app);
		
	}


	public void setMessageSource(MessageSource messageSource) {
		System.out.println("setMessageSource()........."+messageSource);
		
	}


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext()......."+applicationContext);
		
	}
	
}
