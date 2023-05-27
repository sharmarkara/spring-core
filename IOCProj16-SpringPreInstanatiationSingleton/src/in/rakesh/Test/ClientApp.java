package in.rakesh.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.rakesh.bean.Flipkart;



public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/rakesh/cfg/applicationContext.xml");
		System.out.println("IOC container created...");
		
	}
}
