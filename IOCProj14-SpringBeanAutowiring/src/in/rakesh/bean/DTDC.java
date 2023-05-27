package in.rakesh.bean;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class is loading...");
	}

	public DTDC() {
		System.out.println("DTDC object is instantiated....");
	}

	@Override
	public String deliver(int oid) {
		
		return "DTDC courier will be deliver order id ::"+oid+"order products";

	}

}
