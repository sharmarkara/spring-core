package in.rakesh.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.rakesh.bean.Robot;


public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("in/rakesh/cfg/applicationContext.xml");
		
		Robot robot = applicationContext.getBean("robot",Robot.class);
		System.out.println(robot);
		
		applicationContext.close();
	}
}
