package in.rakesh.bean;

import java.util.Date;

//Target Class---->UserDefined
public class WishMessageGenerator {

	// Dependent Class---->Predefined
	private Date date;

	static {
		System.out.println("WishMessageGenerator.class is loading");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is instantiated");
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setdate()");
		this.date = date;
	}

	// business logic to use Injected date in the Target Class Object
	public String generateWishMessage(String name) {
		System.out.println("Date oject created using setter inject with value ::"+date);
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
