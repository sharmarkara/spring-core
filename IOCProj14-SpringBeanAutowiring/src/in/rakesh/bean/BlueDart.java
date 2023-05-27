package in.rakesh.bean;

public class BlueDart implements Courier {

	
	static
	{
		System.out.println("BlueDart.class is loading");
	}
	
	public BlueDart() {
		System.out.println("BluDart object is instantiated...");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart courier will be deliver order id ::"+oid+"order products";
	}

}
