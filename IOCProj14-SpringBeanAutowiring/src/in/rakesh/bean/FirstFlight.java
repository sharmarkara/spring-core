package in.rakesh.bean;

public class FirstFlight implements Courier {

	static
	{
		System.out.println("FirstFlight.class is loading...");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight object is instantiated...");
	}
	
	
	
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "FirstFlight courier will be deliver order id ::"+oid+"order products";
	}

}
