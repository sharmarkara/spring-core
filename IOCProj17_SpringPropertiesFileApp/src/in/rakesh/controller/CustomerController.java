package in.rakesh.controller;

import in.rakesh.dto.CustomerDTO;
import in.rakesh.service.ICustomerMgmtService;
import in.rakesh.vo.CustomerVo;

public class CustomerController {

	ICustomerMgmtService service;
	
	static
	{
		System.out.println("MainController.class file is loading...");
	}
	public CustomerController(ICustomerMgmtService service) {
		System.out.println("MainController :: one param constructor...");
		this.service=service;
	}
	
	public String processResult(CustomerVo vo)
	{
		CustomerDTO dto = new CustomerDTO();
		
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		String result = service.calculateSimpleInterest(dto);
		return result;
	}
		
}
