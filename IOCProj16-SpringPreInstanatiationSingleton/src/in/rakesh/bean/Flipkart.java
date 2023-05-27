package in.rakesh.bean;

import java.util.Arrays;
import java.util.Random;

//Target object
public class Flipkart {
	
	//Dependent object
	private Courier courier;
	
	static
	{
		System.out.println("Flipkart.class file is loading...");
	}
	
	public Flipkart()
	{
		System.out.println("Flipkart object is created");
	}
	
	//Constructor injection
	public Flipkart(Courier courier) {
		System.out.println("Flipkart object is injected through constructor");
		this.courier = courier;
	}

	//Setter injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart object is injected through setter injection ");
		this.courier = courier;
	}


	//Business logic
	public String shopping(String[] items,float[] prices)
	{
		System.out.println("Flipkart Shopping");
		System.out.println(courier.getClass().getName());
		Random random=null;
		float billAmt=0.0f;
		int oid=0;
		for(float price:prices)
		{
			billAmt+=price;
		}
		random=new Random();
		oid=random.nextInt(1000);
		String msg=courier.deliver(oid);
		return Arrays.toString(items) + "are purchases having prices"+Arrays.toString(prices)+" with the bill amount :: "+billAmt +"--->"+msg ;
	}
}
