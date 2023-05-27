package in.rakesh.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.rakesh.bean.Employee;

public class TestApp {

	public static void main(String[] args) {

		//Using the FileSystemResource to locate the configuration file
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");
		
		//Creating an IOC container
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		
		//Requesting IOC container to give the object,searching will happen in cache and if it will not found then 
		//object will be created by loading and performing setter injection
//		Object object = factory.getBean("wmg");
//		WishMessageGenerator generator=(WishMessageGenerator)object;
		 Employee employee = factory.getBean("emp",Employee.class);
		

		//Using the target object performing the operation and printing the result
		System.out.println(employee);
	}

}
