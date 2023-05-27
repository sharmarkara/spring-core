package in.rakesh.service;

import in.rakesh.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public abstract String calculateSimpleInterest(CustomerDTO dto);
}
