package in.ineuron.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.ineuron")
public class AppConfig {

	static
	{
		System.out.println("AppConfig.class file is loading");
	}
	
	public AppConfig() {
		System.out.println("AppConfig class instantiated with zero agrgument constructor");
	}
}

