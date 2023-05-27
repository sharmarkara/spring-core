package in.rakesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.rakesh.comp.WishMessageGenerator;
import in.rakesh.config.AppConfig;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("****Container started *****");


		WishMessageGenerator wmg = factory.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		
		String msg=wmg.greetMessage("Rakesh");
		System.out.println(msg);
		
		((AbstractApplicationContext) factory).close();
		System.out.println("****Container closed *****");
	}
}
