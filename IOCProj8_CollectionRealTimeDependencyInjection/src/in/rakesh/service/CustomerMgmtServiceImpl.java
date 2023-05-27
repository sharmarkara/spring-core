package in.rakesh.service;

import in.rakesh.bo.CustomerBO;
import in.rakesh.dao.ICustomerDAO;
import in.rakesh.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;

	static {
		System.out.println("CustomerMgmtServiceImpl.class file is loading...");
	}

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl:: 1 param constructor.... ");
		this.dao = dao;
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO dto) {

		float intrAmt = 0.0f;
		intrAmt = (dto.getPamt() * dto.getRate() * dto.getTime()) / 100.0f;

		CustomerBO bo = new CustomerBO();

		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setCustomerName(dto.getCustomerName());
		bo.setInterestAmt(intrAmt);
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(bo.getTime());
		bo.setInterestAmt(intrAmt);

		int count = dao.insert(bo);

		// process the result
		if (count == 0)

			return "Customer Registration failed ::" + dto.getPamt() + "Interest" + intrAmt;

		else

			return "Customer Registration Successfull ::" + dto.getPamt() + "Interest" + intrAmt;

	}

}
