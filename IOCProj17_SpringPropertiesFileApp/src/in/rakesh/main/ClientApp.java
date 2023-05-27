package in.rakesh.main;

import java.io.BufferedReader;
import java.util.Scanner;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.rakesh.controller.CustomerController;
import in.rakesh.vo.CustomerVo;

public class ClientApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the CustomerName :: ");
		String customerName=scanner.next();
		
		System.out.print("Enter the CustomerAddress :: ");
		String customerAddress=scanner.next();
		
		System.out.print("Enter the Principle Amount :: ");
		String pamount=scanner.next();
		
		System.out.print("Enter the Time period :: ");
		String time=scanner.next();
		
		System.out.print("Enter the Rate of Interest :: ");
		String rate=scanner.next();
		
		CustomerVo vo = new CustomerVo();
		vo.setCustomerName(customerName);
		vo.setCustomerAddress(customerAddress);
		vo.setPamt(pamount);
		vo.setRate(rate);
		vo.setTime(time);
		
		
		CustomerController controller = factory.getBean("controller",CustomerController.class);
		System.out.println(controller.processResult(vo));
		
		scanner.close();
	}

}
