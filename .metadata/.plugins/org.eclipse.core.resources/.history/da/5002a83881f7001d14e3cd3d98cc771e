package in.rakesh.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.rakesh.bean.Flipkart;



public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/rakesh/cfg/applicationContext.xml");
		
		Flipkart flipkart = factory.getBean("fpkt",Flipkart.class);
		String result = flipkart.shopping(new String[] {"fossil","Puma","iphone"}, new float[] {109992.3f,20000.5f,80000.90f});
	
		System.out.println(result);
	}
}
