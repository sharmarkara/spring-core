package in.rakesh.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

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
		WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);
		
		//Searching will happen in cache, it is found so get it from cache only.
		WishMessageGenerator generator2 = factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println("Generator1 class object reference ::"+generator1.hashCode());
		System.out.println("Generator1 class object reference ::"+generator2.hashCode());
		
		System.out.println();
		
		//Using the target object performing the operation and printing the result
		String result = generator1.generateWishMessage("Rakesh");
		System.out.println(result);
	}

}
