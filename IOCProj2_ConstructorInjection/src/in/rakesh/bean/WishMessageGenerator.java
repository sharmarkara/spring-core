package in.rakesh.bean;

import java.util.Date;

//Target Class---->UserDefined
public class WishMessageGenerator {

	//Has-A relationship--One class object is injecting in another class.
	// Dependent Class---->Predefined
	private Date date;

	static {
		System.out.println("WishMessageGenerator.class is loading");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("Constructor injection is happening to inject Date object...::"+ date);
		this.date = date;
	}



	// business logic to use Injected date in the Target Class Object
	public String generateWishMessage(String name) {
		@SuppressWarnings("deprecation")
		int hour = date.getHours();
		if (hour <= 12)

			return "Hello :: " + name + "Good Morning!!!";

		else if (hour <= 16)

			return "Hello :: " + name + "Good Afternoon!!!";

		else if (hour <= 20)

			return "Hello :: " + name + "Good Evening!!!";

		else

			return "Hello :: " + name + "Good Night!!!";

	}
}
