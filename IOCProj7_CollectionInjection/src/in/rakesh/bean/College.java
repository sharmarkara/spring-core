package in.rakesh.bean;

import java.util.Date;
import java.util.List;

public class College {

	private List<String> nameList;
	private List<Date> dateList;
	
	static
	{
		System.out.println("College.class file is loading...");
	}
	public College() {
		System.out.println("College object is instatniated...");
	}
	
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}


	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}


	@Override
	public String toString() {
		return "College [nameList=" + nameList + ", dateList=" + dateList + "]";
	}
	
	
}
