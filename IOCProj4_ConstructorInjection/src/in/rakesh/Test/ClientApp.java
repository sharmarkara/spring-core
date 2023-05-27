package in.rakesh.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.rakesh.bean.Person;

public class ClientApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/rakesh/cfg/applicationContext.xml");

		Person person1 = factory.getBean("person1", Person.class);

		System.out.println(person1);

		Person person2 = factory.getBean("person2", Person.class);

		System.out.println(person2);
	}

}
