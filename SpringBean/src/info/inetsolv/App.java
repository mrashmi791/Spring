package info.inetsolv;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		
		reader.loadBeanDefinitions("spring.xml");
		
		Object object = beanFactory.getBean("person");
		
		Person person = (Person) object;
		person.display();

	}

}
