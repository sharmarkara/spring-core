package in.rakesh.vo;

public class CustomerVo {

	private String customerName;
	private String customerAddress;
	private String pamt;
	private String rate;
	private String time;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPamt() {
		return pamt;
	}

	public void setPamt(String pamount) {
		this.pamt = pamount;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate2) {
		this.rate = rate2;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time2) {
		this.time = time2;
	}

	@Override
	public String toString() {
		return "CustomerVo [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + "]";
	}

}
